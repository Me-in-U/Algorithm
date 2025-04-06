package BAEKJOON.Platinum.Platinum_V.P16570번_앞뒤가_맞는_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static int max = 0;
  private static int count = 0;
  private static int N = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    long[] arr = new long[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = N - 1; i >= 0; i--) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    buildPMT(arr);
    if (max != 0 && count != 0) {
      System.out.println(max + " " + count);
    } else {
      System.out.println(-1);
    }
  }

  public static void buildPMT(long[] arr) {
    int[] pmt = new int[N];
    int length = 0;
    for (int i = 1; i < N; i++) {
      while (length != 0 && arr[i] != arr[length]) {
        length = pmt[length - 1];
      }
      if (arr[i] == arr[length]) {
        pmt[i] = ++length;
      }
      if (length > 0) {
        if (max < pmt[i]) {
          max = pmt[i];
          count = 1;
        } else if (max == pmt[i]) {
          count++;
        }
      }
    }
  }
}