package BAEKJOON.Silver.Silver_IV.P30404번_오리와_박수치는_춘배;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int count = 1;
    int startTime = Integer.parseInt(st.nextToken());
    for (int i = 0; i < N - 1; i++) {
      int X = Integer.parseInt(st.nextToken());
      if (startTime + K < X) {
        count++;
        startTime = X;
      }
    }
    System.out.println(count);
  }
}