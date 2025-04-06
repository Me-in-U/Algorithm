package BAEKJOON.Bronze.Bronze_III.P10990번_별_찍기_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
      //좌삼각
      for(int j = 0; j < N - 1 - i; j++) {
        sb.append(" ");
      }
      sb.append("*");
      //우삼각
      for(int j = i * 2 - 1; j > 0; j--){
        sb.append(" ");
      }
      if(i >= 1){
        sb.append("*");
      }
      sb.append('\n');
		}
    System.out.print(sb.toString());
	}
}