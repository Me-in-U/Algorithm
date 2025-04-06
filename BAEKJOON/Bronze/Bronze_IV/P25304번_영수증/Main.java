package BAEKJOON.Bronze.Bronze_IV.P25304번_영수증;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int X = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      X -= Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
    }
    if (X == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}