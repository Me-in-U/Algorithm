package BAEKJOON.Bronze.Bronze_IV.P28490번_Area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    int max = 0;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      max = Math.max(max, Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
    }
    System.out.println(max);
  }
}