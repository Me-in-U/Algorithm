package BAEKJOON.Bronze.Bronze_III.P2441번_별_찍기_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
         for(int j = 0; j < i; j++){
            sb.append(" ");
         }
         for(int j = i; j < N; j++){
            sb.append("*");
         }
         sb.append('\n');
		}
      System.out.println(sb);
	}
}
