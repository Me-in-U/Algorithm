package BAEKJOON.Silver.Silver_II.P1874번_스택_수열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    int seq[] = new int[n];
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stk = new Stack<>();
    
    for(int i = 0; i <n; i++)
      seq[i] = Integer.parseInt(br.readLine());
    int number = 1;
    int turn = 0;
    int pop_count = 0;
    while(pop_count<n){
      if(number<=seq[turn]){
        stk.push(number);
        number++;
        sb.append("+").append('\n');
      }
      if(stk.get(stk.size()-1) >= seq[turn]){
        stk.pop();
        pop_count++;
        turn++;
        sb.append("-").append('\n');
      }
      else if (number > seq[turn]){
        sb.delete(0, sb.length());
        sb.append("NO");
        break;
      }
      
    }
    bw.write(String.valueOf(sb));
    bw.flush();
  }
}