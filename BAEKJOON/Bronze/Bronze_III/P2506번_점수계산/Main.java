package BAEKJOON.Bronze.Bronze_III.P2506번_점수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int sum = 0;
    int score = 1;
    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      if (Integer.parseInt(st.nextToken()) == 1) {
        sum += score++;
      } else {
        score = 1;
      }
    }
    System.out.println(sum);
  }
}