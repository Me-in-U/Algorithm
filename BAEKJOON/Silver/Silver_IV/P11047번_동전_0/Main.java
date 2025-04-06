package BAEKJOON.Silver.Silver_IV.P11047번_동전_0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Stack<Integer> stk = new Stack<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    
    for(int i = 0; i< N; i++){
     int num = Integer.parseInt(br.readLine()); 
      stk.add(num);
    }
    
    int count = 0;
    for (;K>0;){
      int div = stk.pop();
      int count2 = K / div;
      if(div <= K && count2 > 0){
        K = K - (div * count2);
        count += count2;
      }
    }
    
    bw.write(String.valueOf(count));
    bw.newLine();
    bw.flush();
  }
}