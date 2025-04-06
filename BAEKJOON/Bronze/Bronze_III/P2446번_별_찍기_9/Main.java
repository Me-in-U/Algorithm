package BAEKJOON.Bronze.Bronze_III.P2446번_별_찍기_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i = N; i > 1; i--){
      for(int j = i; j <= N - 1; j++){
        sb.append(" ");
      }
      for(int j = 0; j < ((2 * i) - 1); j++){
        sb.append("*");
      }
      sb.append('\n');
    }
		for(int i = 1; i <= N; i++){
      for(int j = i; j <= N - 1; j++){
        sb.append(" ");
      }
      for(int j = 0; j < ((2 * i) - 1); j++){
        sb.append("*");
      }
      sb.append('\n');
		}
    System.out.println(sb);
	}
}