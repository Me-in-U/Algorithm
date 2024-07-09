package BAEKJOON.Gold.Gold_V.P5972번_택배_배송;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static class Node implements Comparable<Node> {
        int to;
        int cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node n) {
            return this.cost - n.cost;
        }
    }

    protected static int N;
    protected static int M;
    protected static int[] distance;
    protected static ArrayList<Node>[] list;
    protected static boolean[] visited;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        visited = new boolean[N + 1];
        distance = new int[N + 1];
        Arrays.fill(distance, 50000001);
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A_i = Integer.parseInt(st.nextToken());
            int B_i = Integer.parseInt(st.nextToken());
            int C_i = Integer.parseInt(st.nextToken());
            list[A_i].add(new Node(B_i, C_i));
            list[B_i].add(new Node(A_i, C_i));
        }
        PriorityQueue<Node> q = new PriorityQueue<>();
        distance[1] = 0;
        q.offer(new Node(1, 0));
        while (!q.isEmpty()) {
            Node current = q.poll();
            if (!visited[current.to]) {
                visited[current.to] = true;
                for (int i = 0; i < list[current.to].size(); i++) {
                    Node next = list[current.to].get(i);
                    if (distance[next.to] > (distance[current.to] + next.cost)) {
                        distance[next.to] = (distance[current.to] + next.cost);
                        q.offer(new Node(next.to, distance[next.to]));
                    }
                }
            }
        }
        System.out.println(distance[N]);
    }
}