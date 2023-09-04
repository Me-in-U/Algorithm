package Gold_IV.P9019번_DSLR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Bfs_Object {
  int number;
  String route;

  Bfs_Object(int number, String route) {
    this.number = number;
    this.route = route;
  }
}

public class Main {
  public static boolean[] visited;
  public static int A, B;
  public static StringBuilder result;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    result = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      A = Integer.parseInt(st.nextToken());
      B = Integer.parseInt(st.nextToken());
      visited = new boolean[10001];
      visited[A] = true;
      bfs();
    }
    System.out.print(result.toString());
  }

  public static void bfs() {
    Queue<Bfs_Object> q = new LinkedList<>();
    q.add(new Bfs_Object(A, ""));
    while (!q.isEmpty()) {
      Bfs_Object now_obj = q.poll();
      int now_num = now_obj.number;
      String now_route = now_obj.route;
      if (now_num == B) {
        result.append(now_route).append('\n');
        break;
      }
      int D_num = function_D(now_num);
      int S_num = function_S(now_num);
      int L_num = function_L(now_num);
      int R_num = function_R(now_num);
      if (!visited[D_num]) {
        q.add(new Bfs_Object(D_num, now_route + "D"));
        visited[D_num] = true;
      }
      if (!visited[S_num]) {
        q.add(new Bfs_Object(S_num, now_route + "S"));
        visited[S_num] = true;
      }
      if (!visited[L_num]) {
        q.add(new Bfs_Object(L_num, now_route + "L"));
        visited[L_num] = true;
      }
      if (!visited[R_num]) {
        q.add(new Bfs_Object(R_num, now_route + "R"));
        visited[R_num] = true;
      }
    }
  }

  public static int function_D(int a) {
    return (a * 2) % 10000;
  }

  public static int function_S(int a) {
    if (a != 0)
      return (a - 1);
    else
      return 9999;
  }

  public static int function_L(int a) {
    int[] arr = new int[4];
    arr[0] = a / 1000;
    a %= 1000;
    arr[1] = a / 100;
    a %= 100;
    arr[2] = a / 10;
    a %= 10;
    arr[3] = a;
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < 4; i++) {
      sb.append(arr[i]);
    }
    sb.append(arr[0]);
    return Integer.parseInt(sb.toString());
  }

  public static int function_R(int a) {
    int[] arr = new int[4];
    arr[0] = a / 1000;
    a %= 1000;
    arr[1] = a / 100;
    a %= 100;
    arr[2] = a / 10;
    a %= 10;
    arr[3] = a;
    StringBuilder sb = new StringBuilder();
    sb.append(arr[3]);
    for (int i = 0; i < 3; i++) {
      sb.append(arr[i]);
    }
    return Integer.parseInt(sb.toString());
  }
}
