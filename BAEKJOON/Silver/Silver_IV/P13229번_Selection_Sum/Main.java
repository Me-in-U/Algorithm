package BAEKJOON.Silver.Silver_IV.P13229번_Selection_Sum;

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
    int[] arr = new int[N + 1];
    arr[0] = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 1; i < N + 1; i++)
      arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
    int M = Integer.parseInt(br.readLine());
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken()) + 1;
      int end = Integer.parseInt(st.nextToken()) + 1;
      sb.append(arr[end] - arr[start - 1]).append('\n');
    }
    System.out.print(sb.toString());
  }
}