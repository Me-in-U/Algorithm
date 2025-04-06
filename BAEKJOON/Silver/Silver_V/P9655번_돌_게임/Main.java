package BAEKJOON.Silver.Silver_V.P9655번_돌_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
    System.out.println((N % 2 == 0) ? "CY" : "SK");
	}
}