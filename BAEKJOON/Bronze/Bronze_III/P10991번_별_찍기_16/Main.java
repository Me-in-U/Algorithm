package BAEKJOON.Bronze.Bronze_III.P10991번_별_찍기_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
    for(int i = 0; i < N; i++) {
      for(int j = N - i - 1; j > 0; j--) {
				sb.append(" ");
			}
			for(int j = 0; j < i * 2 + 1; j++) {
				if(j % 2 == 0){
          sb.append("*");
        }
				else{
          sb.append(" ");
        }
			}
      sb.append('\n');
    }
    System.out.print(sb.toString());
	}
}