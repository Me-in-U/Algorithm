package BAEKJOON.Bronze.Bronze_III.P2444번_별_찍기_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++){
      for(int j = 1; j <= N - i; j++){
        sb.append(" ");
      }
      for(int j = 1; j <= (2 * i) - 1; j++){
        sb.append("*");
      }
      sb.append('\n');
		}
    for(int i = N - 1; i >= 1; i--){
      for(int j = 1; j <= N - i; j++){
        sb.append(" ");
      }
      for(int j = 1; j <= (2 * i) - 1; j++){
        sb.append("*");
      }
      sb.append('\n');
		}
    System.out.println(sb.toString());
	}
}