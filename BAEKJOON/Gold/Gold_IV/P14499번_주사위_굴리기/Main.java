package P14499번_주사위_굴리기;

import java.io.IOException;

public class Main {
    private static StringBuilder sb; // 출력
    private static int[][] map; // 지도
    // 이동 방향: X, 동, 서, 북, 남
    private static final int[] dx = { 0, 0, 0, -1, 1 };
    private static final int[] dy = { 0, 1, -1, 0, 0 };
    // 주사위 면 인덱스 상수
    private static final int TOP = 0, NORTH = 1, EAST = 2, WEST = 3, SOUTH = 4, BOTTOM = 5;
    private static int N;
    private static int M;

    private static class Dice {
        int x;
        int y;
        int[] numbers;

        Dice(int x, int y) {
            this.x = x;
            this.y = y;
            numbers = new int[6];
        }

        public void movePosition(int newX, int newY) {
            this.x = newX;
            this.y = newY;
        }

        public void roll(int dir) {
            int[] temp = numbers.clone(); // 기존 주사위 6면 값

            switch (dir) {
                case 1: // 동 (East)
                    numbers[TOP] = temp[WEST];
                    numbers[EAST] = temp[TOP];
                    numbers[WEST] = temp[BOTTOM];
                    numbers[BOTTOM] = temp[EAST];
                    break;
                case 2: // 서 (West)
                    numbers[TOP] = temp[EAST];
                    numbers[EAST] = temp[BOTTOM];
                    numbers[WEST] = temp[TOP];
                    numbers[BOTTOM] = temp[WEST];
                    break;
                case 3: // 북 (North)
                    numbers[TOP] = temp[SOUTH];
                    numbers[NORTH] = temp[TOP];
                    numbers[SOUTH] = temp[BOTTOM];
                    numbers[BOTTOM] = temp[NORTH];
                    break;
                case 4: // 남 (South)
                    numbers[TOP] = temp[NORTH];
                    numbers[NORTH] = temp[BOTTOM];
                    numbers[SOUTH] = temp[TOP];
                    numbers[BOTTOM] = temp[SOUTH];
                    break;
                default:
                    break;
            }
            updateMapAfterRoll();
        }

        private void updateMapAfterRoll() {
            // 주사위를 굴렸을 때
            if (map[this.x][this.y] == 0) { // 이동한 칸에 쓰여 있는 수가 0이면
                // 주사위의 바닥면에 쓰여 있는 수가 칸에 복사
                map[this.x][this.y] = numbers[BOTTOM];
            } else {// 이동한 칸에 쓰여 있는 수가 0이 아닌 경우
                // 칸에 쓰여 있는 수가 주사위의 바닥면으로 복사되며, 칸에 쓰여 있는 수는 0
                numbers[BOTTOM] = map[this.x][this.y];
                map[this.x][this.y] = 0;
            }
        }

        // 상단에 쓰인 값 출력
        public void printUpFace() {
            sb.append(this.numbers[TOP]).append('\n');
        }

    }

    public static void main(String[] args) throws IOException {
        // 변수
        N = readInt(); // 세로 크기
        M = readInt(); // 가로 크기
        int x = readInt(); // 주사위 x 좌표
        int y = readInt(); // 주사위 y 좌표
        int K = readInt(); // 명령의 개수
        Dice dice = new Dice(x, y); // 주사위 생성

        // 출력
        sb = new StringBuilder(2 * K);

        // 지도 초기화
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = readInt();
            }
        }

        // 명령 입력
        while (K-- > 0) {
            int dir = readInt();
            int nextX = dice.x + dx[dir];
            int nextY = dice.y + dy[dir];
            if (isValid(nextX, nextY)) {
                dice.movePosition(nextX, nextY);
                dice.roll(dir);
                dice.printUpFace();
            }
        }
        System.out.print(sb.toString());
    }

    private static boolean isValid(int x, int y) {
        return (0 <= x && x < N) && (0 <= y && y < M);
    }

    // 숫자만 읽기
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