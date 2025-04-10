package SWEA.P5656번_벽돌_깨기;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution_5656_벽돌깨기_김민규 {
    private static class Block {
        int num;
        boolean broken;

        Block(int num) {
            this.num = num;
            this.broken = false;
        }
    }

    private static List<Block>[] map;
    private static int N, W, H, minCount;
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };
    private static StringBuilder sb = new StringBuilder();

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        // System.setIn(new FileInputStream(
        // "C:\\Users\\SSAFY\\Documents\\GitHub\\Algorithm\\SWEA\\P5656번_벽돌_깨기\\sample_input.txt"));
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            N = readInt();
            W = readInt();
            H = readInt();
            minCount = Integer.MAX_VALUE;
            map = new ArrayList[W];
            for (int i = 0; i < W; i++) {
                map[i] = new ArrayList<>();
            }
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    int num = readInt();
                    if (num != 0) {
                        map[j].add(0, new Block(readInt()));
                    }
                }
            }
            dfs(0);
            sb.append("#").append(t).append(" ").append(minCount).append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    private static void dfs(int depth) {
        int remain = countBlocks(map);
        if (remain == 0) {
            minCount = 0;
            return;
        }
        if (depth == N) {
            if (remain < minCount) {
                minCount = remain;
            }
            return;
        }
        for (int col = 0; col < W; col++) {
            List<Block>[] snapshot = deepCopy(map);
            if (!map[col].isEmpty()) {
                int idx = map[col].size() - 1;
                setBroken(idx, col);
                removeBroken();
            }
            dfs(depth + 1);
            // 백트래킹
            map = snapshot;
        }
    }

    private static void setBroken(int x, int y) {
        Block block = map[y].get(x);
        block.broken = true;
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[] { x, y, block.num });
        while (!dq.isEmpty()) {
            int[] cur = dq.poll();
            int curX = cur[0], curY = cur[1], range = cur[2];
            for (int i = 0; i < 4; i++) {
                for (int j = 1; j < range; j++) {
                    int nextX = curX + dx[i] * j;
                    int nextY = curY + dy[i] * j;
                    if (nextY < 0 || nextY >= W || nextX < 0 || nextX >= map[nextY].size())
                        continue;
                    Block nextBlock = map[nextY].get(nextX);
                    if (!nextBlock.broken) {
                        nextBlock.broken = true;
                        if (nextBlock.num > 1) {
                            dq.add(new int[] { nextX, nextY, nextBlock.num });
                        }
                    }
                }
            }
        }
    }

    private static void removeBroken() {
        for (int i = 0; i < W; i++) {
            map[i].removeIf(b -> b.broken);
        }
    }

    // 남은 블록 수 계산
    private static int countBlocks(List<Block>[] boardState) {
        int cnt = 0;
        for (int i = 0; i < W; i++) {
            cnt += boardState[i].size();
        }
        return cnt;
    }

    @SuppressWarnings("unchecked")
    private static List<Block>[] deepCopy(List<Block>[] boardState) {
        List<Block>[] newBoard = new ArrayList[W];
        for (int i = 0; i < W; i++) {
            newBoard[i] = new ArrayList<>(boardState[i].size());
            for (Block b : boardState[i]) {
                newBoard[i].add(new Block(b.num));
            }
        }
        return newBoard;
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
