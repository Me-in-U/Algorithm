package BAEKJOON.Gold.Gold_IV.P1504번_특정한_최단_경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
  private static ArrayList<Node>[] edges;
  private static int N;
  private static int E;
  private static int v1;
  private static int v2;
  private static int INF = Integer.MAX_VALUE;

  private static int[] dijkstra(int from) {
    PriorityQueue<Node> pq = new PriorityQueue<>();
    int[] distance = new int[N];
    Arrays.fill(distance, INF);
    distance[from] = 0;
    pq.add(new Node(from, 0));
    while (!pq.isEmpty()) {
      Node node = pq.poll();
      int nodeVertex = node.vertex;
      int nodeWeight = node.weight;
      if (nodeWeight > distance[nodeVertex])
        continue;
      for (Node nextNode : edges[nodeVertex]) {
        int distance_update = nextNode.weight + distance[nodeVertex];
        if (distance[nextNode.vertex] > distance_update) {
          distance[nextNode.vertex] = distance_update;
          pq.add(new Node(nextNode.vertex, distance_update));
        }
      }
    }
    return distance;
  }

  private static class Node implements Comparable<Node> {
    int vertex;
    int weight;

    public Node(int vertex, int weight) {
      this.vertex = vertex;
      this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
      return this.weight - o.weight;
    }
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    E = Integer.parseInt(st.nextToken());
    edges = new ArrayList[N];
    for (int i = 0; i < N; i++) {
      edges[i] = new ArrayList<>();
    }
    for (int i = 0; i < E; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken()) - 1;
      int v = Integer.parseInt(st.nextToken()) - 1;
      int w = Integer.parseInt(st.nextToken());
      edges[u].add(new Node(v, w));
      edges[v].add(new Node(u, w));
    }
    st = new StringTokenizer(br.readLine());
    v1 = Integer.parseInt(st.nextToken()) - 1;
    v2 = Integer.parseInt(st.nextToken()) - 1;
    int[] from_1_to = dijkstra(0);
    int[] from_v1_to = dijkstra(v1);
    int[] from_N_to = dijkstra(N - 1);

    if (from_v1_to[v2] != INF
        && ((from_1_to[v1] != INF && from_N_to[v2] != INF) || (from_1_to[v2] != INF && from_N_to[v1] != INF))) {
      long _1_v1_v2_N = (long) from_1_to[v1] + from_v1_to[v2] + from_N_to[v2];
      long _1_v2_v1_N = (long) from_1_to[v2] + from_v1_to[v2] + from_N_to[v1];
      long min = Math.min(_1_v1_v2_N, _1_v2_v1_N);
      System.out.println(min);
    } else {
      System.out.println(-1);
    }
  }
}