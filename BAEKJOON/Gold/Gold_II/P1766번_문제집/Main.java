package Gold_II.P1766번_문제집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] indegree = new int[N + 1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int prior = Integer.parseInt(input[0]);
            int later = Integer.parseInt(input[1]);
            graph.get(prior).add(later);
            indegree[later]++;
        }
        for (int i = 1; i <= N; i++)
            if (indegree[i] == 0)
                pq.offer(i);
        while (!pq.isEmpty()) {
            int now = pq.poll();
            sb.append(now + " ");
            for (int next : graph.get(now)) {
                if (--indegree[next] == 0) {
                    pq.offer(next);
                }
            }
        }
        System.out.print(sb.toString());
    }
}