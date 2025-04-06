package BAEKJOON.Bronze.Bronze_I.P4344번_평균은_넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int[] score = new int[a];
      double sum = 0.0;
      for (int k = 0; k < a; k++) {
        score[k] = Integer.parseInt(st.nextToken());
        sum += score[k];
      }
      double avg = sum / (double) a;
      double count = 0.0;
      for (int k = 0; k < a; k++) {
        if (avg < score[k]) {
          count++;
        }
      }
      double result = (count / a) * 100;

      // 출력
      System.out.printf("%.3f", result);
      System.out.println("%");
    }
  }
}