package SWEA.P5644번_무선_충전;

import java.io.IOException;

public class Main {
    private static class Pos {
        int x, y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Pos other = (Pos) obj;
            return this.x == other.x && this.y == other.y;
        }
    }

    private static class BC {
        Pos position;
        int coverage, performance;

        BC(int x, int y, int coverage, int performance) {
            this.position = new Pos(x, y);
            this.coverage = coverage;
            this.performance = performance;
        }

        boolean isInRange(Pos playerPos) {
            return Math.abs(this.position.x - playerPos.x) + Math.abs(this.position.y - playerPos.y) < this.coverage;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            BC other = (BC) obj;
            return this.position.equals(other.position);
        }
    }

    private static class Player {
        Pos position;
        int[] movements;
        static int[] moveDataX = { 0, -1, 0, 1, 0 };
        static int[] moveDataY = { 0, 0, 1, 0, -1 };

        Player(int x, int y, int[] movements) {
            this.position = new Pos(x, y);
            this.movements = movements;
        }

        void move(int move) {
            this.position.x += moveDataX[movements[move]];
            this.position.y += moveDataY[movements[move]];
        }
    }

    private static int M, A;
    private static Player p1, p2;
    private static BC[] bcs;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            M = readInt(); // 이동 시간
            A = readInt();// BC의 개수
            // 플레이어 생성
            p1 = new Player(1, 1, new int[M]);
            for (int i = 0; i < M; i++)
                p1.movements[i] = readInt();
            p2 = new Player(10, 10, new int[M]);
            for (int i = 0; i < M; i++)
                p2.movements[i] = readInt();
            // BC 생성
            bcs = new BC[A];
            for (int i = 0; i < A; i++) {
                int y = readInt();
                int x = readInt();
                int coverage = readInt();
                int performance = readInt();
                bcs[i] = new BC(x, y, coverage, performance);
            }
            int performanceSum = 0;
            for (int i = 0; i < M; i++) {
                p1.move(i);
                p2.move(i);
                performanceSum += getMaxPerformance();
            }
            sb.append("#").append(t).append(" ").append(performanceSum).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int getMaxPerformance() {
        int maxPerformance = 0;
        boolean p1InRange = false;
        boolean p2InRange = false;
        for (BC bc1 : bcs) {
            if (bc1.isInRange(p1.position)) {
                p1InRange = true;
                System.out.println("p1 In range");
                for (BC bc2 : bcs) {
                    p2InRange = true;
                    if (bc2.isInRange(p2.position)) {
                        System.out.println("p2 In range");
                        if (bc1.equals(bc2)) {
                            maxPerformance = Math.max(maxPerformance, bc1.performance);
                        } else {
                            maxPerformance = Math.min(maxPerformance, bc1.performance + bc2.performance);
                        }
                    }
                }
            }
        }
        return maxPerformance;
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
