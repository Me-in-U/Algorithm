package SWEA.P7465번_창용_마을_무리의_개수;

/**
 * <h1>SW Expert Academy 7465번 창용 마을 무리의 개수</h1>
 * <p>
 * JAVA 8 : 메모리 27,136KB, 시간 95 ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-26
 */

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Solution_7465_창용마을무리의개수_김민규 {
    private static int[] parent;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            int N = readInt();
            int M = readInt();
            parent = new int[N + 1];

            // 초기화 : 자신이 부모노드
            for (int i = 1; i <= N; i++) {
                parent[i] = i;
            }
            while (M-- > 0) {
                int a = readInt();
                int b = readInt();
                union(a, b);
            }

            // 모든 사람의 부모를 최상위 부모로 갱신(경로 압축)
            for (int i = 1; i <= N; i++) {
                parent[i] = find(i);
            }
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= N; i++) {
                set.add(find(i));
            }
            sb.append(set.size()).append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * 최상위 부모노드 찾기(+ 경로 압축)
     * 
     * @param x
     * @return
     */
    private static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    /**
     * a, b의 부모 노드를 찾고 한쪽의 부모로 통일
     * 
     * @param a 노드 a
     * @param b 노드 b
     */

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