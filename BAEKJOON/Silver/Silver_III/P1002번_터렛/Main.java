package BAEKJOON.Silver.Silver_III.P1002번_터렛;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int r1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int r2 = Integer.parseInt(st.nextToken());
      double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      if (distance == 0) {
        if (r1 == r2) {
          sb.append("-1").append('\n');
        } else {
          sb.append("0").append('\n');
        }
      } else if (distance > r1 + r2) {
        sb.append("0").append('\n');
      } else if (distance == r1 + r2) {
        sb.append("1").append('\n');
      } else if (distance < r1 + r2) {
        if (r1 < r2 && r1 + distance == r2) {
          sb.append("1").append('\n');
        } else if (r2 < r1 && r2 + distance == r1) {
          sb.append("1").append('\n');
        } else if ((r1 < r2 && r1 + distance < r2) || (r2 < r1 && r2 + distance < r1)) {
          sb.append("0").append('\n');
        } else {
          sb.append("2").append('\n');
        }
      }
    }
    System.out.print(sb);
  }
}