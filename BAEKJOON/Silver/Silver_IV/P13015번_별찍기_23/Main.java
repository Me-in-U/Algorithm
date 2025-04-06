package BAEKJOON.Silver.Silver_IV.P13015번_별찍기_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    if (N == 2) {
      sb.append("** **").append('\n');
      sb.append(" ***").append('\n');
      sb.append("** **").append('\n');
      System.out.print(sb.toString());
      return;
    }
    int space = 2 * N - 3;
    String space_mid_front = repeat(" ", N - 1);
    String space_star = repeat(" ", N - 2);
    String star_space_star = "*" + space_star + "*";
    String top_bottom = repeat("*", N) + repeat(" ", space) + repeat("*", N);

    sb.append(top_bottom).append('\n');
    for (int i = 1; i < N - 1; i++) {
      space -= 2;
      sb.append(repeat(" ", i)).append(star_space_star);
      sb.append(repeat(" ", space)).append(star_space_star);
      sb.append('\n');
    }
    sb.append(space_mid_front).append("*").append(space_star).append("*").append(space_star).append("*").append('\n');
    for (int i = N - 2; i >= 1; i--) {
      sb.append(repeat(" ", i)).append(star_space_star);
      sb.append(repeat(" ", space)).append(star_space_star);
      sb.append('\n');
      space += 2;
    }
    sb.append(top_bottom).append('\n');
    System.out.print(sb.toString());
  }

  public static String repeat(String str, int times) {
    return String.format("%0" + times + "d", 0).replace("0", str);
  }
}