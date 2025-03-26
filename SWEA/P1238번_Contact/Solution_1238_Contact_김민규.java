package SWEA.P1238번_Contact;

/**
 * <h1>SW Expert Academy 1238번 Contact</h1>
 * <p>
 * JAVA 8 : 메모리 25,088KB, 시간 83 ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-26
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Solution_1238_Contact_김민규 {
    // 동일한 {from, to}쌍이 여러 번 반복되는 경우대비 set으로
    private static Set<Integer>[] graph;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = 0;
        while (++T <= 10) {
            sb.append("#").append(T).append(" ");
            graph = new HashSet[101];
            for (int i = 1; i <= 100; i++) {
                graph[i] = new HashSet<>();
            }
            int dataLength = readInt() >> 1;
            int startPoint = readInt();
            while (dataLength-- > 0) {
                int from = readInt();
                int to = readInt();
                graph[from].add(to);
            }
            sb.append(bfs(startPoint)).append("\n");
        }
        System.out.print(sb.toString().trim());
    }

    /**
     * @param start 시작하는 당번 번호
     * @return 가장 나중에 연락을 받게 되는 사람 중 번호가 가장 큰 사람
     */
    private static int bfs(int start) {
        int max = -1;
        Deque<Integer> nodes = new ArrayDeque<>();
        boolean[] visited = new boolean[101];
        visited[start] = true;
        nodes.add(start);
        while (!nodes.isEmpty()) {
            // 연락 받는 단계마다 최대 번호를 다시 찾는다
            int size = nodes.size();
            max = -1;
            while (size-- > 0) {
                int cur = nodes.poll();
                max = Math.max(max, cur);
                for (int next : graph[cur]) {
                    if (!visited[next]) {
                        visited[next] = true;
                        nodes.add(next);
                    }
                }
            }
        }
        return max;
    }

    private static int readInt() throws IOException {
        int n = 0;
        int c = System.in.read();
        while (c <= 32) {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
