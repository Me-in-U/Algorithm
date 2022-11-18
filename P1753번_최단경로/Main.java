package P1753번_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
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
    for (int i = 0; i < V; i++) {
      for (int j = 0; j < E; j++) {
        if (i == j) {
          weight[i][j] = 0;
        } else {
          weight[i][j] = -1;
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

  }

  public static void dijkstra() {

  }
}