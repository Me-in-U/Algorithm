package BAEKJOON.Silver.Silver_IV.P10773번_제로;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Integer> stk = new Stack<>();
    int K = Integer.parseInt(br.readLine());
    int sum = 0;
    for(int i = 0; i< K; i++){
      int N = Integer.parseInt(br.readLine());
      if(N!=0)
        stk.push(N);
      else if(N==0)
        stk.pop();
    }
    int size = stk.size();
    for(int j = 0; j < size; j++){
      sum += stk.pop();
    }
    bw.write(String.valueOf(sum));
    bw.newLine();
    bw.flush();
  }
}