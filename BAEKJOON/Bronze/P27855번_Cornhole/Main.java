package BAEKJOON.Bronze.P27855번_Cornhole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int H1 = Integer.parseInt(st.nextToken());
    int B1 = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int H2 = Integer.parseInt(st.nextToken());
    int B2 = Integer.parseInt(st.nextToken());
    int p1 = (3 * H1) + B1;
    int p2 = (3 * H2) + B2;
    StringBuilder sb = new StringBuilder();
    if (p1 > p2) {
      sb.append("1 ").append(p1 - p2);
    } else if (p2 > p1) {
      sb.append("2 ").append(p2 - p1);
    } else {
      sb.append("NO SCORE");
    }
    System.out.print(sb.toString());
  }
}