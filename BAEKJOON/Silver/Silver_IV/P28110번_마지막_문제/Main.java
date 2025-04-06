package BAEKJOON.Silver.Silver_IV.P28110번_마지막_문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    String[] input = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }
    Arrays.sort(arr);
    int max = 0;
    int res = -1;
    for (int i = 1; i < N; i++) {
      int diff = (arr[i] - arr[i - 1]) / 2;
      if (max < diff) {
        max = diff;
        res = (arr[i] + arr[i - 1]) / 2;
      }
    }
    System.out.println(res);
  }
}