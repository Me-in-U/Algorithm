package P1987번_알파벳;

import java.io.IOException;

public class Main {
    private static final int[] dx = { 1, -1, 0, 0 };
    private static final int[] dy = { 0, 0, 1, -1 };
    private static byte[][] board;
    private static int R;
    private static int C;
    private static int max = 1;
    private static int[][] visited;

    public static void main(String[] args) throws IOException {
        R = readInt();
        C = readInt();
        board = new byte[R][C + 1];
        visited = new int[R][C];
        for (int i = 0; i < R; i++)
            System.in.read(board[i]);
        int startMask = 1 << (board[0][0] & 31);
        dfs(0, 0, startMask, 1);
        System.out.print(max);
    }

    private static void dfs(int x, int y, int usedLetters, int count) {
        if ((max = Math.max(max, count)) == 26) {
            return;
        }
        visited[x][y] = usedLetters;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (0 <= nx && nx < R && 0 <= ny && ny < C) {
                int nextLetter = 1 << (board[nx][ny] & 31);
                boolean notUsedBefore = (usedLetters & nextLetter) == 0;
                int nextLetterAdded = usedLetters | nextLetter;
                if (notUsedBefore && (nextLetterAdded != visited[nx][ny])) {
                    dfs(nx, ny, nextLetterAdded, count + 1);
                }
            }
        }
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
