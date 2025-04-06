package BAEKJOON.Bronze.Bronze_III.P10995번_별_찍기_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int N = Integer.parseInt(br.readLine());
    int printed = 0;
    while(printed != N){
      printed++;
      if(printed % 2 == 1){
        for(int j = 0; j < N; j++){
          sb.append("* ");
        }
        sb.append('\n');
      }
      else if(printed % 2 == 0){
        for(int j = 0; j < N; j++){
          sb.append(" *");
        }
        sb.append('\n');
      }
    }
    System.out.print(sb);
  }
}