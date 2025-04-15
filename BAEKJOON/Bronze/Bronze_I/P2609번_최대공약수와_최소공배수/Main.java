package BAEKJOON.Bronze.Bronze_I.P2609번_최대공약수와_최소공배수;

/**
 * <h1>BAEKJOON 2609번 최대공약수와 최소공배수</h1>
 * <p>
 * JAVA11 : 메모리 14124KB, 시간 104ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-15
 */
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int a = readInt();
		int b = readInt();
		int d = gcd(a, b);
		StringBuilder sb = new StringBuilder();
		sb.append(d).append("\n").append(a * b / d);
		System.out.print(sb.toString());
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	private static int readInt() throws IOException {
		int c = System.in.read(), n = 0;
		while (c <= ' ')
			c = System.in.read();
		while ('0' <= c && c <= '9') {
			n = (n * 10) + (c & 15);
			c = System.in.read();
		}
		return n;
	}
}