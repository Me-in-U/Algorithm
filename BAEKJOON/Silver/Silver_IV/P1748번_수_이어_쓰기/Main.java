package BAEKJOON.Silver.Silver_IV.P1748번_수_이어_쓰기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    int N = Integer.parseInt(br.readLine());
    int result = 0;

    for(int i = 1; i <= N; i *= 10){
      result += (N - i) + 1;
    }
    System.out.println(result); 
	}
}