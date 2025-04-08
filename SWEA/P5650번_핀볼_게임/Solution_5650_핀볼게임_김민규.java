package SWEA.P5650번_핀볼_게임;

/**
 * <h1>SW Expert Academy 5650번 핀볼 게임</h1>
 * <p>
 * JAVA 8 : 메모리 28,584 KB, 시간 571ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-12
 */

import java.io.IOException;

public class Solution_5650_핀볼게임_김민규 {
    // 좌표 클래스
    public static class Position {
        int x;
        int y;

        // 상(0),하(1),좌(2),우(3)
        static final int[] dx = { -1, 1, 0, 0 };
        static final int[] dy = { 0, 0, -1, 1 };

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        /**
         * this 객체의 x, y를 @param position 위치로 변경
         */
        public void setPosition(Position position) {
            this.x = position.x;
            this.y = position.y;
        }

        /**
         * @param direction 방향으로 이동
         */
        public void move(int direction) {
            this.x += dx[direction];
            this.y += dy[direction];
        }
    }

    // 웜홀 클래스
    public static class Wormhole {
        Position wormhole1;
        Position wormhole2;

        /**
         * wormhole1, wormhole2 중에 생성되지 않은 Position에 @param x @param y 위치로 Position 객체
         * 생성
         */
        public void setPos(int x, int y) {
            if (wormhole1 == null) {
                wormhole1 = new Position(x, y);
            } else {
                wormhole2 = new Position(x, y);
            }
        }

        /**
         * @param position -> wormhole1, wormhole2 중 하나의 Position
         * @return (wormhole1, wormhole2 중 @param position 과 다른 Position)
         */
        public Position getOppositeHole(Position position) {
            return (wormhole1.x == position.x && wormhole1.y == position.y) ? this.wormhole2 : this.wormhole1;
        }

        public void clear() {
            wormhole1 = null;
            wormhole2 = null;
        }
    }

    private static final Wormhole[] wormholes = new Wormhole[11];
    // 최대 크기 지도
    private static final int[][] map = new int[102][102];
    // afterCollideBlock[블록 번호][현재 방향] -> 블럭과 충돌 후 변경될 방향
    private static final int[][] afterCollideBlock = { null, { 1, 3, 0, 2 }, { 3, 0, 1, 2 }, { 2, 0, 3, 1 },
            { 1, 2, 3, 0 }, { 1, 0, 3, 2 } };

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // 맵 일부 초기화
        // 벽 대신 사각 블록(5번)으로 ┌ (좌, 상) 기본값
        for (int i = 0; i < 102; i++) {
            map[i][0] = 5;
            map[0][i] = 5;
        }
        // 웜홀 초기화
        for (int h = 6; h <= 10; h++) {
            wormholes[h] = new Wormhole();
        }
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 변수 초기화 및 맵 입력
            int maxScore = 0;
            int N = readInt();
            // 웜홀 번호는 6~10번
            for (int h = 6; h <= 10; h++) {
                wormholes[h].clear();
            }
            for (int x = 1; x <= N; x++) {
                for (int y = 1; y <= N; y++) {
                    int blockNum = readInt();
                    map[x][y] = blockNum;
                    // 웜홀 생성
                    if (6 <= blockNum) {
                        wormholes[blockNum].setPos(x, y);
                    }
                }
            }
            // 벽 대신 사각 블록(5번)으로 ┘(하, 우): Test Case N 마다 바뀜
            for (int i = 0; i <= N + 1; i++) {
                map[i][N + 1] = 5;
                map[N + 1][i] = 5;
            }
            // 빈공간에서 모든 방향으로 탐색하기
            for (int x = 1; x <= N; x++) {
                for (int y = 1; y <= N; y++) {
                    int blockNum = map[x][y];
                    if (blockNum == 0) {
                        for (int dir = 0; dir < 4; dir++) {
                            int score = search(x, y, dir);
                            if (maxScore < score) {
                                maxScore = score;
                            }
                        }
                    }
                }
            }
            // 결과 append
            sb.append('#').append(t).append(' ').append(maxScore).append('\n');
        }
        // 진짜 출력
        System.out.print(sb.toString());
    }

    /**
     * @param startX , @param startY 에서 시작해서 @param dir 방향으로 탐색 시작
     * @return int score: 부딪힌 횟수
     */
    public static int search(int startX, int startY, int dir) {
        int score = 0;
        Position pos = new Position(startX, startY);
        while (true) {
            pos.move(dir);
            int blockNumber = map[pos.x][pos.y];
            // 블랙홀이거나 시작치로 돌아오면 끝
            if ((blockNumber == -1) || (pos.x == startX && pos.y == startY)) {
                break;
            }

            // 블럭이면 그거에 맞게 방향 바꿈
            if (1 <= blockNumber && blockNumber <= 5) {
                dir = afterCollideBlock[blockNumber][dir];
                score++;
            }
            // 웜홀이면 같은 번호 또 다른 웜홀로 이동
            else if (6 <= blockNumber) {
                Position oppositeHole = wormholes[blockNumber].getOppositeHole(pos);
                pos.setPosition(oppositeHole);
            } // blockNumber 0 무시
        }
        return score;
    }

    // 정수 빨리 읽기
    public static int readInt() throws IOException {
        int n = 0;
        int c = System.in.read();
        boolean isNegative = false;
        while (c <= 32) {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c - '0');
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}