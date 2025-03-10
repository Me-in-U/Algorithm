package P9576번_책_나눠주기;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainBipartiteMatching {
    private static int N;
    private static int M;
    private static int[] selected;
    private static boolean[] visited;
    private static List<Integer>[] graph;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        while (T-- > 0) {
            N = readInt();
            M = readInt();
            selected = new int[N + 1];
            visited = new boolean[M + 1];
            graph = new ArrayList[M + 1];
            for (int i = 1; i <= M; i++)
                graph[i] = new ArrayList<>();
            for (int student = 1; student <= M; student++) {
                int from = readInt();
                int to = readInt();
                for (int book = from; book <= to; book++) {
                    graph[student].add(book);
                }
            }
            int result = 0;
            for (int student = 1; student <= M; student++) {
                visited = new boolean[M + 1];
                if (dfs(student)) {
                    result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }

    private static boolean dfs(int student) {
        if (visited[student]) {
            return false;
        }
        visited[student] = true;
        for (int book : graph[student]) {
            if (selected[book] == 0 || dfs(selected[book])) {
                selected[book] = student;
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
