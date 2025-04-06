package BAEKJOON.Gold.Gold_I.P28082번_기계오리_연구;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static int N;
  public static int K;
  protected static int[] batteries;
  protected static Set<Integer> set;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    N = Integer.parseInt(input[0]);
    K = Integer.parseInt(input[1]);
    batteries = new int[N];
    String[] data = br.readLine().split(" ");
    for (int i = 0; i < data.length; i++) {
      batteries[i] = Integer.parseInt(data[i]);
    }
    set = new HashSet<>();
    dfs(new HashSet<>(N), 0, 0);
    List<Integer> list = new ArrayList<>(set);
    Collections.sort(list);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < list.size(); i++) {
      sb.append(list.get(i) + " ");
    }
    System.out.print(sb.toString());
  }

  public static void dfs(Set<Integer> index, int depth, int sum) {
    if (depth == K) {
      return;
    }
    for (int i = 0; i < N; i++) {
      if (!index.contains(i)) {
        index.add(i);
        set.add(sum + batteries[i]);
        dfs(index, depth + 1, sum + batteries[i]);
        index.remove(i);
      }
    }
  }
}