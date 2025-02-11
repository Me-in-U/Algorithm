package P1260번_DFS와_BFS;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static boolean connection[][];
    private static boolean checked[];
    private static int N;

    public static void main(String[] args) throws IOException {
        // 입력
        N = readInt();
        int M = readInt();
        int V = readInt();
        connection = new boolean[N + 1][N + 1];
        checked = new boolean[N + 1];
        while (M-- > 0) {
            int from = readInt();
            int to = readInt();
            connection[from][to] = connection[to][from] = true;
        }
        // dfs 계산
        dfs(V);

        // 초기화
        checked = new boolean[N + 1];
        sb.append('\n');

        // bfs 계산
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(V);
        checked[V] = true;
        sb.append(V).append(' ');
        while (!queue.isEmpty()) {
            int from = queue.poll();
            for (int to = 1; to <= N; to++) {
                if (connection[from][to] && !checked[to]) {
                    sb.append(to).append(' ');
                    queue.add(to);
                    checked[to] = true;
                }
            }
        }
        System.out.print(sb.toString());
    }

    public static void dfs(int i) {
        checked[i] = true;
        sb.append(i).append(' ');
        for (int j = 1; j <= N; j++)
            if (connection[i][j] && !checked[j])
                dfs(j);
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}