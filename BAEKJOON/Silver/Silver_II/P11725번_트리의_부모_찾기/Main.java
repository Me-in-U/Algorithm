package BAEKJOON.Silver.Silver_II.P11725번_트리의_부모_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  private static int[] result;
  private static ArrayList<Integer>[] list;
  private static int N;
  // private static boolean[] visited;

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;

    N = Integer.parseInt(br.readLine());
    result = new int[N + 1];
    // visited = new boolean[N + 1];
    list = new ArrayList[N + 1];
    for (int i = 1; i <= N; i++) {
      list[i] = new ArrayList<>();
    }

    for (int i = 0; i < N - 1; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      list[a].add(b);
      list[b].add(a);
    }
    search(1, -1);
    for (int i = 2; i <= N; i++) {
      sb.append(result[i]).append('\n');
    }
    System.out.println(sb.toString());
  }

  // 참조수정
  public static void search(int start, int parent) {
    for (int next : list[start]) {
      if (next != parent) {
        result[next] = start;
        search(next, start);
      }
    }
  }
  // public static void search(int start) {
  // visited[start] = true;
  // while (!list[start].isEmpty()) {
  // int next = list[start].get(0);
  // if (!visited[next]) {
  // result[next] = start;
  // list[start].remove(0);
  // search(next);
  // } else {
  // list[start].remove(0);
  // }
  // }
  // }
}