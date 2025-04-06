package BAEKJOON.Bronze.Bronze_II.P2798번_블랙잭;

import java.io.IOException;

public class Main_dfs {
    private static boolean[] visited;
    private static int[] nums;
    private static int N;
    private static int M;
    private static int max = 0;

    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        visited = new boolean[N];
        nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = readInt();
        dfs(0, 0);
        System.out.println(max);
    }

    private static void dfs(int depth, int sum) {
        if (depth == 3) {
            if (sum <= M && max < sum)
                max = sum;
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, sum + nums[i]);
                visited[i] = false;
            }
        }
    }

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