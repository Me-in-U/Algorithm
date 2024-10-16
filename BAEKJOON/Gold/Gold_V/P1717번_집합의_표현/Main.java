package P1717번_집합의_표현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  protected static int[] parent;

  public static void main(String[] args) throws NullPointerException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    parent = new int[n + 1];
    for (int i = 1; i <= n; i++)
      parent[i] = i;
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int calculate = Integer.parseInt(st.nextToken());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if (calculate == 0)
        union(a, b);
      else
        sb.append(findParent(a) == findParent(b) ? "YES" : "NO").append('\n');
    }
    System.out.print(sb.toString());
  }

  public static int findParent(int x) {
    if (x == parent[x])
      return x;
    parent[x] = findParent(parent[x]);
    return parent[x];
  }

  public static void union(int a, int b) {
    a = findParent(a);
    b = findParent(b);
    if (a != b) {
      if (a < b)
        parent[b] = a;
      else
        parent[a] = b;
    }
  }
}