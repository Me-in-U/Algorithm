package SWEA.P5656번_벽돌_깨기;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    private static class Block {
        int num;
        boolean broken;

        Block(int num) {
            this.num = num;
            this.broken = false;
        }

        @Override
        public String toString() {
            return String.valueOf(num);
        }
    }

    // 초기 보드 상태 (각 열을 ArrayList<Block>로 관리)
    static List<Block>[] map; // copyMap는 여기서 사용하지 않고 deep copy 메서드로 생성
    static int N, W, H, minCount;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    // dropPosition은 이전에 사용했던 변수명(여기서는 사용하지 않음)
    static StringBuilder sb = new StringBuilder();

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
                        map[j].add(0, new Block(num));
                    }
                }
            }
            // N중 재귀 DFS
            dfs(0, map);
            sb.append("#").append(t).append(" ").append(minCount).append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    private static void dfs(int depth, List<Block>[] curMap) {
        int remain = countBlocks(curMap);
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
            List<Block>[] newMap = deepCopy(curMap);
            if (!newMap[col].isEmpty()) {
                int idx = newMap[col].size() - 1;
                setBroken(idx, col, newMap);
                removeBroken(newMap);
            }
            dfs(depth + 1, newMap);
        }
    }

    private static void setBroken(int x, int y, List<Block>[] boardState) {
        Block block = boardState[y].get(x);
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
                    if (nextY < 0 || nextY >= W || nextX < 0 || nextX >= boardState[nextY].size())
                        continue;
                    Block nextBlock = boardState[nextY].get(nextX);
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

    private static void removeBroken(List<Block>[] boardState) {
        for (int i = 0; i < W; i++) {
            boardState[i].removeIf(b -> b.broken);
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

    // 기존 readInt() 유지
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