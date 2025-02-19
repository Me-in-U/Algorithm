package SWEA.P순열기본;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static int[] data;
    private static int[] result;
    private static int N;
    private static int R;
    private static StringBuilder sb = new StringBuilder();
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            sb.append('#').append(t).append('\n');
            N = readInt();
            R = readInt();
            data = new int[N];
            visited = new boolean[N];
            result = new int[R];
            for (int i = 0; i < N; i++)
                data[i] = readInt();
            Arrays.sort(data);
            dfs(0);
        }
        System.out.print(sb.toString());
    }

    public static void dfs(int depth) {
        if (depth == R) {
            for (int i = 0; i < R; i++)
                sb.append(result[i]).append(' ');
            sb.append('\n');
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                result[depth] = data[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
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
