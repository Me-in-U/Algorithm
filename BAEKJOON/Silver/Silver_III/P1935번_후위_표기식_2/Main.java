package BAEKJOON.Silver.Silver_III.P1935번_후위_표기식_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Double> stk = new Stack<>();
    double alph[] = new double[26];
    
		double N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    int length = str.length();
		for(int i = 0; i < N; i++)
      alph[i] = Integer.parseInt(br.readLine());

    for(int i = 0; i < length; i++){
      char c = str.charAt(i);
      if(c >= 'A' && c <= 'Z')
        stk.add(alph[(int)c - 65]);
      else{
        double b = stk.pop();
        double a = stk.pop();
        
        if(c == '+')
          stk.add(a + b);
        else if(c == '-')
          stk.add(a - b);
        else if(c == '*')
          stk.add(a * b);
        else if(c == '/')
          stk.add(a / b);
      }
    }
    System.out.println(String.format("%.2f", stk.pop()));
	}
}