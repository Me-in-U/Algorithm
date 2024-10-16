package P1916번_최소비용_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
  private static ArrayList<Node>[] node_List;
  private static int N, M, findFrom, findTo;
  private static int INF = Integer.MAX_VALUE;
  private static int[] minCost;

  private static void dijkstra() {
    PriorityQueue<Node> pq = new PriorityQueue<>();
    Arrays.fill(minCost, INF);
    minCost[findFrom] = 0;
    pq.add(new Node(findFrom, 0));
    while (!pq.isEmpty()) {
      Node node = pq.poll();
      int nodeVertex = node.vertex;
      int nodeCost = node.Cost;
      if (minCost[nodeVertex] < nodeCost)
        continue;
      for (Node nextNode : node_List[nodeVertex]) {
        int vertex_update = nextNode.vertex;
        int minCost_update = nextNode.Cost + minCost[nodeVertex];
        if (minCost[vertex_update] > minCost_update) {
          minCost[vertex_update] = minCost_update;
          pq.add(new Node(vertex_update, minCost_update));
        }
      }
    }
  }

  private static class Node implements Comparable<Node> {
    int vertex;
    int Cost;

    public Node(int vertex, int Cost) {
      this.vertex = vertex;
      this.Cost = Cost;
    }

    @Override
    public int compareTo(Node o) {
      return this.Cost - o.Cost;
    }
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // !변수 설정
    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());
    minCost = new int[N + 1];
    node_List = new ArrayList[N + 1];
    for (int i = 1; i <= N; i++) {
      node_List[i] = new ArrayList<>();
    }
    // !입력
    StringTokenizer st = null;
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken());
      int to = Integer.parseInt(st.nextToken());
      int cost = Integer.parseInt(st.nextToken());
      node_List[from].add(new Node(to, cost));
    }
    String[] find = br.readLine().split(" ");
    findFrom = Integer.parseInt(find[0]);
    findTo = Integer.parseInt(find[1]);
    // !계산
    dijkstra();
    // !출력
    System.out.println(minCost[findTo]);
  }
}