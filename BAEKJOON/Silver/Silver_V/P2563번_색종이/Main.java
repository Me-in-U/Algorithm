package BAEKJOON.Silver.Silver_V.P2563번_색종이;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		boolean[][] dohwaji = new boolean[101][101];
		int papers = readInt();
		for (int i = 0; i < papers; i++) {
			int x = readInt();
			int y = readInt();
			for (int xpos = x; xpos < x + 10; xpos++) {
				for (int ypos = y; ypos < y + 10; ypos++) {
					dohwaji[xpos][ypos] = true;
				}
			}
		}
		int result = 0;
		for (int x = 0; x <= 100; x++)
			for (int y = 0; y <= 100; y++)
				if (dohwaji[x][y])
					result++;

		System.out.print(result);
	}

	public static int readInt() throws IOException {
		int c;
		int n = System.in.read() & 15;
		while ((c = System.in.read()) >= 48)
			n = (n * 10) + (c & 15);
		if (c == 13)
			System.in.read();
		return n;
	}
}