package SWEA.P3289번_서로소_집합;

/**
 * <h1>SW Expert Academy 3289번 서로소 집합</h1>
 * <p>
 * JAVA 8 : 메모리 49,764KB, 시간 336 ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-26
 */

import java.io.IOException;

public class Solution_3289_서로소집합_김민규 {
    private static int[] parent;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            int n = readInt();
            int m = readInt();
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
            while (m-- > 0) {
                int op = readInt();
                int a = readInt();
                int b = readInt();
                if (op == 0) {
                    union(a, b);
                } else {
                    sb.append(find(a) == find(b) ? "1" : "0");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
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