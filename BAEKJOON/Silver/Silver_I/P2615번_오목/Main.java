package BAEKJOON.Silver.Silver_I.P2615번_오목;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static class Result {
        boolean found = false;
        int dol;
        int x;
        int y;

        Result(boolean found) {
            this.found = found;
        }

        Result(boolean found, int dol, int x, int y) {
            this.found = found;
            this.dol = dol;
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            if (this.found) {
                return new StringBuilder().append(this.dol).append('\n')
                        .append(this.x + 1).append(' ').append(this.y + 1).toString();
            }
            return "0";
        }

    }

    public static int[][] map = new int[19][19];
    public static int[] dx = { 1, 1, 0, -1 };
    public static int[] dy = { 0, 1, 1, 1 };

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int x = 0; x < 19; x++) {
            String[] input = br.readLine().split(" ");
            for (int y = 0; y < 19; y++) {
                map[x][y] = Integer.parseInt(input[y]);
            }
        }
        for (int x = 0; x < 19; x++) {
            for (int y = 0; y < 19; y++) {
                if (map[x][y] != 0) {
                    Result result = check(x, y);
                    if (result.found) {
                        System.out.println(result);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }

    public static Result check(int x, int y) {
        for (int d = 0; d < 4; d++) {
            int count = 1;
            // 정방향
            int nextX = x + dx[d];
            int nextY = y + dy[d];
            while (isValid(nextX, nextY) && map[nextX][nextY] == map[x][y]) {
                if (++count > 5)
                    break;
                nextX += dx[d];
                nextY += dy[d];
            }
            // 반대방향
            int prevX = x - dx[d];
            int prevY = y - dy[d];
            while (isValid(prevX, prevY) && map[prevX][prevY] == map[x][y]) {
                if (++count > 5)
                    break;
                prevX -= dx[d];
                prevY -= dy[d];
            }
            if (count == 5) {
                return new Result(true, map[x][y], prevX + dx[d], prevY + dy[d]);
            }
        }
        return new Result(false);
    }

    public static boolean isValid(int x, int y) {
        if (x < 0 || x >= 19 || y < 0 || y >= 19) {
            return false;
        }
        return true;
    }
}
