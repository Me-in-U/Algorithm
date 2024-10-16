package P2623번_음악프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    protected static int[] inDegree;
    protected static LinkedList<Integer>[] graph;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        inDegree = new int[N + 1];
        graph = new LinkedList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new LinkedList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int before = Integer.parseInt(st.nextToken());
            for (int j = 1; j < count; j++) {
                int after = Integer.parseInt(st.nextToken());
                graph[before].add(after);
                inDegree[after]++;
                before = after;
            }
        }
        System.out.println(topologySort(N));
    }

    public static String topologySort(int N) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 1; i < N + 1; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int now = queue.poll();
            sb.append(now).append(' ');
            count++;
            for (int next : graph[now]) {
                if (--inDegree[next] == 0) {
                    queue.add(next);
                }
            }
        }
        return (count != N) ? "0" : sb.toString();
    }
}