package BAEKJOON.Gold.Gold_V.P14567번_선수과목_Prerequisite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    protected static int N;
    protected static int M;
    protected static int[] indegree;
    protected static int[] semester;
    protected static List<Integer>[] graph;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        indegree = new int[N];
        semester = new int[N];
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]) - 1;
            int B = Integer.parseInt(input[1]) - 1;
            graph[A].add(B);
            indegree[B]++;
        }
        topologicalSort();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(semester[i]).append(' ');
        }
        System.out.print(sb.toString().trim());
    }

    public static void topologicalSort() {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
                semester[i] = 1;
            }
        }
        while (!queue.isEmpty()) {
            int prior = queue.poll();
            for (int later : graph[prior]) {
                if (--indegree[later] == 0) {
                    queue.add(later);
                    semester[later] = semester[prior] + 1;
                }
            }
        }
    }
}
