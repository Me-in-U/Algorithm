package BAEKJOON.Bronze.Bronze_I.P1551번_수열의_변화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine(), ",");
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    for (int i = 1; i <= K; i++) {
      for (int j = N - 1; j >= i; j--) {
        arr[j] -= arr[j - 1];
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = K; i < N; i++) {
      sb.append(arr[i]).append(",");
    }
    System.out.print(sb.toString().substring(0, sb.length() - 1));
  }
}