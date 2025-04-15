package SWEA.P5653번_줄기세포배양;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    // 상 하 좌 우
    private static final int[] dx = { -1, 1, 0, 0 };
    private static final int[] dy = { 0, 0, -1, 1 };

    private static Set<Cell> inactiveCells;
    private static Set<Cell> activeCells;
    private static Set<Cell> divisionDone;
    private static Iterator<Cell> iterator;
    private static int N, M, K;

    private static class Section {
        Cell currentCell;

        void addCell(Cell cell) {
            this.addCell(cell, 0);
        }

        void addCell(Cell cell, int currentTime) {
            if (currentCell == null) {
                inactiveCells.add(cell);
                currentCell = cell;
                return;
            }

            if (currentCell.createTime == cell.createTime && currentCell.life < cell.life) {
                inactiveCells.remove(currentCell);
                inactiveCells.add(cell);
                currentCell = cell;
            }
        }
    }

    private static class Cell {
        int x, y, life, createTime, activateTime, dieTime;

        Cell(int x, int y, int life, int createTime) {
            this.x = x;
            this.y = y;
            this.life = life;
            this.createTime = createTime;
            this.activateTime = this.createTime + life;
            this.dieTime = this.activateTime + life;
        }

        Cell division(int direction, int currentTime) {
            int x = this.x + dx[direction];
            int y = this.y + dy[direction];
            Cell newCell = new Cell(x, y, life, currentTime);
            return newCell;
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 0; t < T; t++) {
            N = readInt();
            M = readInt();
            K = readInt();
            inactiveCells = new HashSet<>();
            activeCells = new HashSet<>();
            divisionDone = new HashSet<>();
            Section[][] sections = new Section[K + N + K][K + M + K];
            for (int x = 0; x < K + N + K; x++)
                for (int y = 0; y < K + M + K; y++)
                    sections[x][y] = new Section();
            int currentTime = 0;
            for (int x = K; x < K + N; x++) {
                for (int y = K; y < K + M; y++) {
                    int life = readInt();
                    if (life != 0) {
                        Cell newCell = new Cell(x, y, life, currentTime);
                        sections[x][y].addCell(newCell);
                    }
                }
            }
            while (currentTime++ < K) {
                // 분열될 활성 세포
                for (Cell cell : activeCells) {
                    for (int d = 0; d < 4; d++) {
                        Cell copy = cell.division(d, currentTime);
                        sections[copy.x][copy.y].addCell(copy, currentTime);
                    }
                    divisionDone.add(cell);
                }
                activeCells.clear();

                // 분열 끝난 활성 세포 중 죽을 시간이 된 세포 삭제
                iterator = divisionDone.iterator();
                while (iterator.hasNext()) {
                    Cell cell = iterator.next();
                    if (cell.dieTime == currentTime) {
                        iterator.remove();
                    }
                }

                // 비활성 세포중 활성화 시간이 된 세포 활성화
                iterator = inactiveCells.iterator();
                while (iterator.hasNext()) {
                    Cell cell = iterator.next();
                    if (cell.activateTime == currentTime) {
                        activeCells.add(cell);
                        iterator.remove();
                    }
                }
            }
            // 죽은 세포 수 출력
            sb.append("#").append(t + 1).append(" ")
                    .append(inactiveCells.size() + activeCells.size() + divisionDone.size()).append("\n");
        }
        System.out.print(sb);
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
