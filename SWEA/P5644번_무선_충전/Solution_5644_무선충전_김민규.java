package SWEA.P5644번_무선_충전;

/**
 * <h1>SW Expert Academy 5644번 무선 충전</h1>
 * <p>
 * JAVA 8 : 메모리 27,648KB, 시간 94ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-07
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution_5644_무선충전_김민규 {
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
            return Math.abs(this.position.x - playerPos.x) + Math.abs(this.position.y - playerPos.y) <= this.coverage;
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
        System.setIn(new FileInputStream(
                "C:\\Users\\Zoe_Lowell\\Documents\\GitHub\\Algorithm\\SWEA\\P5644번_무선_충전\\sample_input.txt"));
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            M = readInt(); // 이동 시간
            A = readInt(); // BC의 개수
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
            // 계산 시작
            int performanceSum = 0;
            // 0초 시점
            performanceSum += getMaxPerformance();
            // 1초부터 M초까지
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
        // p1과 p2가 접속 가능한 BC 인덱스 리스트
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            if (bcs[i].isInRange(p1.position))
                listA.add(i);
            if (bcs[i].isInRange(p2.position))
                listB.add(i);
        }

        // 최댓값 구하기
        int max = 0;
        if (listA.isEmpty() && listB.isEmpty())
            return 0;
        if (listA.isEmpty()) {
            for (int j : listB)
                max = Math.max(max, bcs[j].performance);
            return max;
        }
        if (listB.isEmpty()) {
            for (int i : listA)
                max = Math.max(max, bcs[i].performance);
            return max;
        }

        // 조합
        for (int i : listA) {
            for (int j : listB) {
                if (i == j) {
                    max = Math.max(max, bcs[i].performance);
                } else {
                    max = Math.max(max, bcs[i].performance + bcs[j].performance);
                }
            }
        }
        return max;
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
