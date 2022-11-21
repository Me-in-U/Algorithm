package P1753번_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
  private static ArrayList<Node>[] list;
  private static int V, E, K;
  private static int INF = Integer.MAX_VALUE;
  private static int[] distance;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    // 변수 설정
    st = new StringTokenizer(br.readLine());
    V = Integer.parseInt(st.nextToken());
    E = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(br.readLine());

    list = new ArrayList[V + 1];
    for (int i = 1; i <= V; i++) {
      // list인덱스마다 ArrayList생성
      list[i] = new ArrayList<>();
    }
    distance = new int[V + 1];
    Arrays.fill(distance, INF);
    distance[K] = 0;
    for (int i = 0; i < E; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      // u -> v (가중치 w)
      list[u].add(new Node(v, w));
      // list[1] -> 2, w = 2
      // list[1] -> 3, w = 3
      // list[2] -> 3, w = 4
      // list[2] -> 4, w = 5
      // list[3] -> 4, w = 6
      // list[5] -> 1, w = 1
    }

    dijkstra();

    // 출력
    for (int i = 1; i <= V; i++) {
      if (distance[i] == INF) {
        System.out.println("INF");
      } else {
        System.out.println(distance[i]);
      }
    }
  }

  private static void dijkstra() {
    PriorityQueue<Node> pq = new PriorityQueue<>();
    // K -> K (가중치 0) 큐에 추가
    // new Node(1, 0)
    pq.add(new Node(K, 0));
    while (!pq.isEmpty()) {
      Node node = pq.poll();
      int vertex = node.vertex;
      int weight = node.weight;

      if (distance[vertex] < weight) {
        continue;
      }
      for (int i = 0; i < list[vertex].size(); i++) {
        int vertex2 = list[vertex].get(i).vertex;
        int weight2 = list[vertex].get(i).weight + weight;
        if (distance[vertex2] > weight2) {
          distance[vertex2] = weight2;
          pq.add(new Node(vertex2, weight2));
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
}