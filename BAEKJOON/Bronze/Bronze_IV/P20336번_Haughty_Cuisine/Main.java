package BAEKJOON.Bronze.Bronze_IV.P20336번_Haughty_Cuisine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] graph;
    static boolean[] visited;
    static int cycleCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            graph = new int[N + 1];
            visited = new boolean[N + 1];
            cycleCount = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                graph[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    dfs(i);
                    cycleCount++;
                }
            }
            sb.append(cycleCount).append("\n");
        }
        System.out.print(sb.toString());
    }

    public static void dfs(int start) {
        visited[start] = true;
        int next = graph[start];
        if (!visited[next]) {
            dfs(next);
        }
    }
}
