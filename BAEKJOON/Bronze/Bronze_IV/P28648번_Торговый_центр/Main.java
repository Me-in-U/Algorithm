package BAEKJOON.Bronze.Bronze_IV.P28648번_Торговый_центр;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    int min = 200;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int t = Integer.parseInt(st.nextToken());
      int l = Integer.parseInt(st.nextToken());
      min = Math.min(min, t + l);
    }
    System.out.println(min);
  }
}