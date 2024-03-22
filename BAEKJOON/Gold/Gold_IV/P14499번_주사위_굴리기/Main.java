package BAEKJOON.Gold.Gold_IV.P14499번_주사위_굴리기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    protected static StringBuilder sb = new StringBuilder();
    protected static int[][] map;
    // X, 동, 서, 북, 남
    protected static int[] dx = { 0, 0, 0, -1, 1 };
    protected static int[] dy = { 0, 1, -1, 0, 0 };

    public static class Dice {
        int x;
        int y;
        int[] numbers;

        Dice(int x, int y) {
            this.x = x;
            this.y = y;
            numbers = new int[6];
        }

        public void movePosition(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void roll(int dir) {
            int up = this.numbers[0];
            int north = this.numbers[1];
            int east = this.numbers[2];
            int west = this.numbers[3];
            int south = this.numbers[4];
            int down = this.numbers[5];

            switch (dir) {
                case 1: // 동
                    this.numbers[0] = west;
                    this.numbers[2] = up;
                    this.numbers[3] = down;
                    this.numbers[5] = east;
                    break;
                case 2: // 서
                    this.numbers[0] = east;
                    this.numbers[2] = down;
                    this.numbers[3] = up;
                    this.numbers[5] = west;
                    break;
                case 3: // 북
                    this.numbers[0] = south;
                    this.numbers[1] = up;
                    this.numbers[4] = down;
                    this.numbers[5] = north;
                    break;
                case 4: // 남
                    this.numbers[0] = north;
                    this.numbers[1] = down;
                    this.numbers[4] = up;
                    this.numbers[5] = south;
                    break;
                default:
            }
            if (map[this.x][this.y] == 0) {
                map[this.x][this.y] = this.numbers[5];
            } else {
                this.numbers[5] = map[this.x][this.y];
                map[this.x][this.y] = 0;
            }
        }

        public void printUpFace() {
            sb.append(this.numbers[0]).append('\n');
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 변수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Dice dice = new Dice(x, y);

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 명령 입력
        st = new StringTokenizer(br.readLine());
        while (K-- > 0) {
            int dir = Integer.parseInt(st.nextToken());
            int nextX = dice.x + dx[dir];
            int nextY = dice.y + dy[dir];
            if (0 <= nextX && 0 <= nextY && nextX < N && nextY < M) {
                dice.movePosition(nextX, nextY);
                dice.roll(dir);
                dice.printUpFace();
            }
        }
        System.out.print(sb.toString());
    }
}