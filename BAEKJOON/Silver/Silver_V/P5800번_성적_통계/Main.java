package BAEKJOON.Silver.Silver_V.P5800번_성적_통계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    int K = Integer.parseInt(br.readLine());
    for (int i = 0; i < K; i++) {
      st = new StringTokenizer(br.readLine());
      LinkedList<Integer> list = new LinkedList<>();
      int N = Integer.parseInt(st.nextToken());
      for (int j = 0; j < N; j++) {
        list.add(Integer.parseInt(st.nextToken()));
      }
      Collections.sort(list, Collections.reverseOrder());
      int gap = -1;
      for (int g = 0; g < N - 1; g++) {
        int temp = list.get(g) - list.get(g + 1);
        if (temp > gap) {
          gap = temp;
        }
      }
      sb.append("Class ").append(i + 1).append('\n');
      sb.append("Max ").append(list.get(0)).append(", Min ").append(list.get(N - 1)).append(", Largest gap ")
          .append(gap).append('\n');
    }
    System.out.print(sb.toString());
  }
}