package SWEA.P5650_핀볼_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static class Hole {
        int[] hole1;
        int[] hole2;

        public void setPos(int x, int y) {
            if (hole1 == null) {
                hole1 = new int[] { x, y };
            } else {
                hole2 = new int[] { x, y };
            }
        }

        public int[] getAnotherHole(int x, int y) {
            if (hole1[0] == x && hole1[1] == y) {
                return this.hole2;
            }
            return this.hole1;
        }

        // 상(0),하(1),좌(2),우(3)
        private static final int[] dx = { -1, 1, 0, 0 };
        private static final int[] dy = { 0, 0, -1, 1 };
        private static int N;
        private static int score;
        private static int maxScore;
        private static int[][] map;
        private static Hole[] holes;
        private static int[][] afterCollide = { null,
                { 1, 3, 0, 2 }, { 3, 0, 1, 2 }, { 2, 0, 3, 1 },
                { 1, 2, 3, 0, }, { 1, 0, 3, 2 } };
        private static final int[] changeDirection = { 1, 0, 3, 2 };

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            for (int t = 1; t <= T; t++) {
                maxScore = 0;
                st = new StringTokenizer(br.readLine());
                N = Integer.parseInt(st.nextToken());
                map = new int[N][N];
                holes = new Hole[11];
                for (int j = 6; j < 10; j++) {
                    holes[j] = new Hole();
                }
                for (int x = 0; x < N; x++) {
                    st = new StringTokenizer(br.readLine());
                    for (int y = 0; y < N; y++) {
                        int blockNum = Integer.parseInt(st.nextToken());
                        map[x][y] = blockNum;
                        if (6 <= blockNum) {
                            holes[blockNum].setPos(x, y);
                        }
                    }
                }
                for (int x = 0; x < N; x++) {
                    for (int y = 0; y < N; y++) {
                        int blockNum = map[x][y];
                        if (blockNum == 0) {
                            for (int dir = 0; dir < 4; dir++) {
                                score = 0;
                                start(x, y, dir);
                                maxScore = Math.max(maxScore, score);
                            }
                        }
                    }
                }
                sb.append('#').append(t).append(' ').append(maxScore).append('\n');
            }
            System.out.print(sb.toString());
        }

        public static void start(int startX, int startY, int dir) {
            int x = startX;
            int y = startY;
            while (true) {
                int nextX = x + dx[dir];
                int nextY = y + dy[dir];
                if (isValid(nextX, nextY)) {
                    int blockNum = map[nextX][nextY];
                    if (blockNum == -1 ||
                            (nextX == startX && nextY == startY)) {
                        break;
                    }
                } else {
                    dir = changeDirection[dir];
                    score++;
                    if (x == startX && y == startY) {
                        break;
                    }
                    nextX = x;
                    nextY = y;
                }
                int blockNum = map[nextX][nextY];
                if (1 <= blockNum && blockNum <= 5) {
                    dir = afterCollide[blockNum][dir];
                    score++;
                } else if (6 <= blockNum) {
                    int[] anotherHole = holes[blockNum].getAnotherHole(nextX, nextY);
                    nextX = anotherHole[0];
                    nextY = anotherHole[1];
                }
                x = nextX;
                y = nextY;
            }
        }

        public static boolean isValid(int x, int y) {
            if (0 <= x && x < N && 0 <= y && y < N) {
                return true;
            }
            return false;
        }

    }
}