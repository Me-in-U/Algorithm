package BAEKJOON.Silver.Silver_III.P1929번_소수_구하기;

/**
 * <h1>BAEKJOON 1929번 소수 구하기</h1>
 * <p>
 * JAVA8 : 메모리 18,588KB, 시간 152ms<br>
 * JAVA11 : 메모리 19,128KB, 시간 176ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-15
 */

import java.io.IOException;

public class Main_B_1929_소수_구하기_김민규 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		int M = readInt();
		int N = readInt();
		boolean prime[] = new boolean[N + 1]; // Note: false가 소수다
		for (int i = 2; i <= N; i++) {
			// 소수인 경우
			if (prime[i] == false) {
				// 범위 안이면 출력
				if (i >= M)
					sb.append(i).append("\n");
				// 에라토스테네스의 체 => 소수의 배수 제거(N 이하까지)
				for (int j = i + i; j <= N; j += i)
					prime[j] = true;
			}
		}
		System.out.print(sb.toString());
	}

	private static int readInt() throws IOException {
		int c, n = 0;
		c = System.in.read();
		while (c <= ' ') {
			c = System.in.read();
		}
		while ('0' <= c && c <= '9') {
			n = (n * 10) + (c & 15);
			c = System.in.read();
		}
		return n;
	}
}
