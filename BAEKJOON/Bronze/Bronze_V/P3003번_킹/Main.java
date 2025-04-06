package BAEKJOON.Bronze.Bronze_V.P3003번_킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int arr[] = { 1, 1, 2, 2, 2, 8 };
    for (int i = 0; i < 6; i++) {
      int n = Integer.parseInt(st.nextToken());
      if (n >= 0) {
        arr[i] -= n;
      }
      System.out.print(arr[i] + " ");
    }
  }
}
