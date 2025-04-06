package BAEKJOON.Platinum.Platinum_IV.P11375번_열혈강호;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainDFS {
    private static int N;
    private static int M;
    private static int[] selected;
    private static boolean[] visited;
    private static List<Integer>[] graph;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        N = readInt();
        M = readInt();
        selected = new int[M + 1];
        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        for (int empNum = 1; empNum <= N; empNum++) {
            int workCount = readInt();
            graph[empNum] = new ArrayList<>(workCount);
            while (workCount-- > 0) {
                int workNum = readInt();
                graph[empNum].add(workNum);
            }
        }
        int result = 0;
        for (int emp = 1; emp <= N; emp++) {
            visited = new boolean[N + 1];
            if (dfs(emp)) {
                result++;
            }
        }
        sb.append(result).append("\n");
        System.out.print(sb);
    }

    private static boolean dfs(int emp) {
        if (visited[emp]) {
            return false;
        }
        visited[emp] = true;
        for (int work : graph[emp]) {
            if (selected[work] == 0 || dfs(selected[work])) {
                selected[work] = emp;
                return true;
            }
        }
        return false;
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
