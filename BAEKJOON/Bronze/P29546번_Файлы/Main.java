package BAEKJOON.Bronze.P29546번_Файлы;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] jpgs = new String[n];
    for (int i = 0; i < n; i++) {
      jpgs[i] = br.readLine();
    }
    int m = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int l = Integer.parseInt(st.nextToken());
      int r = Integer.parseInt(st.nextToken());
      for (int j = l - 1; j < r; j++) {
        sb.append(jpgs[j]).append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}