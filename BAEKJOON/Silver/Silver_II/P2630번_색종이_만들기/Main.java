package P2630번_색종이_만들기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	protected static int white = 0;
	protected static int blue = 0;
	protected static boolean[][] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine());
		board = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				if (Integer.parseInt(st.nextToken()) == 1)
					board[i][j] = true;
				else
					board[i][j] = false;
			}
		}
		partition(0, 0, N);
		System.out.println(white);
		System.out.println(blue);
	}

	public static void partition(int row, int col, int size) {
		if (allSame(row, col, size)) {
			if (board[row][col])
				blue++;
			else
				white++;
			return;
		}
		int newSize = size / 2;
		partition(row, col, newSize);
		partition(row, col + newSize, newSize);
		partition(row + newSize, col, newSize);
		partition(row + newSize, col + newSize, newSize);
	}

	public static boolean allSame(int row, int col, int size) {
		boolean color = board[row][col];
		for (int i = row; i < row + size; i++)
			for (int j = col; j < col + size; j++)
				if (board[i][j] != color)
					return false;
		return true;
	}
}