package BAEKJOON.Bronze.Bronze_V.P24309번_РАВЕНСТВО;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
      BigInteger a = new BigInteger(br.readLine());
      BigInteger b = new BigInteger(br.readLine());
      BigInteger c = new BigInteger(br.readLine());

		System.out.println(b.subtract(c).divide(a));
	}
}