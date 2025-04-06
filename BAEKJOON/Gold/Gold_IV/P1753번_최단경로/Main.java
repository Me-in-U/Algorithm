package BAEKJOON.Gold.Gold_IV.P1753번_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
  private static ArrayList<Node>[] node_List;
  private static int V, E, K;
  private static int INF = Integer.MAX_VALUE;
  private static int[] distance;

  private static void dijkstra() {
    PriorityQueue<Node> pq = new PriorityQueue<>();
    Arrays.fill(distance, INF);
    distance[K] = 0;
    pq.add(new Node(K, 0));
    while (!pq.isEmpty()) {
      Node node = pq.poll();
      int nodeVertex = node.vertex;
      int nodeWeight = node.weight;
      if (nodeWeight > distance[nodeVertex])
        continue;
      for (Node nextNode : node_List[nodeVertex]) {
        int vertex_update = nextNode.vertex;
        int distance_update = nextNode.weight + distance[nodeVertex];
        if (distance[vertex_update] > distance_update) {
          distance[vertex_update] = distance_update;
          pq.add(new Node(vertex_update, distance_update));
        }
      }
    }
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
    StringTokenizer st = null;

    // 변수 설정
    st = new StringTokenizer(br.readLine());
    V = Integer.parseInt(st.nextToken());
    E = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(br.readLine());

    distance = new int[V + 1];
    node_List = new ArrayList[V + 1];
    for (int i = 1; i <= V; i++) {
      node_List[i] = new ArrayList<>();
    }

    for (int i = 0; i < E; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      node_List[u].add(new Node(v, w));
    }

    dijkstra();

    // 출력
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= V; i++) {
      if (distance[i] == INF) {
        sb.append("INF").append('\n');
      } else {
        sb.append(distance[i]).append('\n');
      }
    }
    System.out.println(sb.toString());
  }
}