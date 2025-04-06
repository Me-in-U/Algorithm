package BAEKJOON.Bronze.Bronze_IV.P5575번_타임_카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      int In = (3600 * Integer.parseInt(st.nextToken())) + (60 * Integer.parseInt(st.nextToken()))
          + Integer.parseInt(st.nextToken());
      int Out = (3600 * Integer.parseInt(st.nextToken())) + (60 * Integer.parseInt(st.nextToken()))
          + Integer.parseInt(st.nextToken());
      int sub = Out - In;
      int hh = (sub / 3600);
      int mm = (sub % 3600) / 60;
      int ss = (sub % 3600) % 60;
      sb.append(hh + " " + mm + " " + ss).append('\n');
    }
    System.out.print(sb);
  }
}