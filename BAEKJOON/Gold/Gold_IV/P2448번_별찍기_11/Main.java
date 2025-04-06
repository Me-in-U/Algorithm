package BAEKJOON.Gold.Gold_IV.P2448번_별찍기_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int k = 0;
    for (int i = 0; i <= 10; i++)
      if (3 * Math.pow(2, i) == N)
        k = i;
    List<StringBuilder> lines = new ArrayList<>(N + 1);
    for (int i = 0; i <= N; i++) {
      lines.add(new StringBuilder());
    }
    lines.get(N - 2).append("  *   ");
    lines.get(N - 1).append(" * *  ");
    lines.get(N).append("***** ");
    StringBuilder spaces = new StringBuilder("   ");
    for (int i = 1; i <= k; i++) {
      int height = 3 * (int) Math.pow(2, i);
      for (int upside = N - height + 1; upside <= N - (height / 2); upside++) {
        lines.get(upside).append(spaces).append(lines.get(upside + (height / 2))).append(spaces);
      }
      for (int rightSide = N - (height / 2) + 1; rightSide <= N; rightSide++) {
        lines.get(rightSide).append(lines.get(rightSide));
      }
      spaces.append(spaces);
    }
    for (int i = 1; i <= N; i++) {
      bw.write(lines.get(i).toString());
      bw.newLine();
    }
    bw.flush();
    bw.close();
  }
}