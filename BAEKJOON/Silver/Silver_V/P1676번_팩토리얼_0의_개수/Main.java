package BAEKJOON.Silver.Silver_V.P1676번_팩토리얼_0의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
      int n = Integer.parseInt(br.readLine());
      int count = 0;
      while(n >= 5){
         count += n / 5;
         n /= 5;
      }

      System.out.println(count);
	}
}
