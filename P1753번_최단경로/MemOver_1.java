package P1753번_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MemOver_1 {
  private static boolean[][] graph;
  private static int[][] weight;
  private static boolean[] visited;
  private static int V, E, startV;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    // input
    st = new StringTokenizer(br.readLine());
    V = Integer.parseInt(st.nextToken());
    E = Integer.parseInt(st.nextToken());
    startV = Integer.parseInt(br.readLine());

    graph = new boolean[V + 1][V + 1];
    weight = new int[V + 1][V + 1];
    visited = new boolean[V + 1];

    // initialize weight
    for (int i = 0; i <= V; i++) {
      for (int j = 0; j <= V; j++) {
        if (i == j) {
          weight[i][j] = 0;
        } else {
          weight[i][j] = 51;
        }
      }
    }
    // weight set
    for (int i = 0; i < E; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      graph[start][end] = true;
      weight[start][end] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < V; i++) {
      int nextV = 0;
      int minW = 51;
      for (int j = 1; j <= V; j++) {
        if (!visited[j] && weight[startV][j] <= minW) {
          nextV = j;
          minW = weight[startV][j];
        }
      }
      // System.out.println("최소 V = " + nextV + " | 가중치 = " + weight[startV][nextV]);
      visited[nextV] = true;
      dijkstra(nextV);
    }
    for (int i = 1; i <= V; i++) {
      if (weight[startV][i] == 51) {
        System.out.println("INF");
      } else {
        System.out.println(weight[startV][i]);
      }
    }
  }

  public static void dijkstra(int check) {
    for (int i = 1; i <= V; i++) {
      if (!visited[i] && weight[check][i] != 51) {
        weight[startV][i] = Math.min(weight[startV][i], weight[startV][check] + weight[check][i]);
      }
    }
  }
}