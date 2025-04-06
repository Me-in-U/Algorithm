package BAEKJOON.Bronze.Bronze_V.P10757번_큰_수_A더하기B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine());
      
      BigInteger bigNumber1 = new BigInteger(st.nextToken());
      BigInteger bigNumber2 = new BigInteger(st.nextToken());

		System.out.println(bigNumber1.add(bigNumber2));
	}
}