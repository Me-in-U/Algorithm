package P1167번_트리의_지름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
  public static LinkedList<int[]>[] vertex;
  public static int weightMax;
  public static boolean[] visited;
  public static int V;
  public static int finalVertex = 0;

  static class Edge {
    int to;
    int weight;

    public Edge(int to, int weight) {
      this.to = to;
      this.weight = weight;
    }
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    V = Integer.parseInt(br.readLine());
    vertex = new LinkedList[V];
    for (int i = 0; i < V; i++) {
      vertex[i] = new LinkedList<>();
    }
    for (int i = 0; i < V; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken()) - 1;
      int to;
      while ((to = Integer.parseInt(st.nextToken())) != -1) {
        vertex[from].add(new int[] { to - 1, Integer.parseInt(st.nextToken()) });
      }
    }
    for (int i = 0; i < 2; i++) {
      weightMax = 0;
      visited = new boolean[V];
      visited[finalVertex] = true;
      dfs(finalVertex, 0);
    }
    System.out.println(weightMax);
  }

  public static void dfs(int vertexNum, int weightSum) {
    if (weightMax < weightSum) {
      weightMax = weightSum;
      finalVertex = vertexNum;
    }
    for (int[] VmW : vertex[vertexNum]) {
      if (!visited[VmW[0]]) {
        visited[VmW[0]] = true;
        dfs(VmW[0], weightSum + VmW[1]);
      }
    }
  }
}
