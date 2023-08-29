package BAEKJOON.Silver.P20529번_가장_가까운_세_사람의_심리적_거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
  protected static String[] input_MBTI;
  protected static String[] selected_MBTI = new String[3];
  protected static boolean[] visited;
  protected static int n;
  protected static PriorityQueue<Integer> pq;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      n = Integer.parseInt(br.readLine());
      input_MBTI = br.readLine().split(" ");
      visited = new boolean[n];
      sb.append(getPsychologicalDistance()).append('\n');
    }
    System.out.print(sb.toString());
  }

  public static int getPsychologicalDistance() {
    pq = new PriorityQueue<>();
    dfs(0);
    return pq.poll();
  }

  public static void dfs(int depth) {
    if (depth == 3) {
      int sum = 0;
      for (int i = 0; i < 4; i++) {
        if (selected_MBTI[0].charAt(i) != selected_MBTI[1].charAt(i)) {
          sum++;
        }
        if (selected_MBTI[1].charAt(i) != selected_MBTI[2].charAt(i)) {
          sum++;
        }
        if (selected_MBTI[0].charAt(i) != selected_MBTI[2].charAt(i)) {
          sum++;
        }
      }
      pq.add(sum);
      return;
    }

    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        visited[i] = true;
        selected_MBTI[depth] = input_MBTI[i];
        dfs(depth + 1);
        visited[i] = false;
      }
    }
  }
}