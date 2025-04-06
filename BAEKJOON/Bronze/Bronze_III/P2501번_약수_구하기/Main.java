package BAEKJOON.Bronze.Bronze_III.P2501번_약수_구하기;

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
    int min = 0;
    int count = 0;
    for (int divisor = 1; divisor <= N; divisor++) {
      if (N % divisor == 0) {
        count++;
        if (count == K) {
          min = divisor;
          break;
        }
      }
    }
    System.out.println(min);
  }
}