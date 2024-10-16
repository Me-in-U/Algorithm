package P2239번_스도쿠;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[][] board = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int x = 0; x < 9; x++) {
            String data = br.readLine();
            for (int y = 0; y < 9; y++)
                board[x][y] = data.charAt(y) - '0';
        }
        solve(0);
        StringBuilder sb = new StringBuilder();
        for (int[] row : board) {
            for (int num : row)
                sb.append(num);
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    public static boolean solve(int count) {
        if (count == 81)
            return true;

        int x = count / 9;
        int y = count % 9;

        if (board[x][y] == 0) {
            for (int num = 1; num <= 9; num++) {
                if (isValid(x, y, num)) {
                    board[x][y] = num;
                    if (solve(count + 1))
                        return true;
                    board[x][y] = 0;
                }
            }
            return false;
        } else {
            return solve(count + 1);
        }
    }

    public static boolean isValid(int x, int y, int num) {
        // 가로 세로
        for (int i = 0; i < 9; i++)
            if (board[x][i] == num || board[i][y] == num)
                return false;
        // 같은 3*3칸
        int boxXStart = (x / 3) * 3;
        int boxYStart = (y / 3) * 3;
        for (int boxX = boxXStart; boxX < boxXStart + 3; boxX++)
            for (int boxY = boxYStart; boxY < boxYStart + 3; boxY++)
                if (board[boxX][boxY] == num)
                    return false;
        return true;
    }
}
