package BAEKJOON.Bronze.Bronze_V.P8393번_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;

		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++){
      sum += i;
		}
    System.out.println(sum);
	}
}