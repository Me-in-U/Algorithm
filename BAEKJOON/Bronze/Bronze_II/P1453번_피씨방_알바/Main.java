package BAEKJOON.Bronze.Bronze_II.P1453번_피씨방_알바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] seats = new boolean[100];
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count = 0;
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken()) - 1;
      if (!seats[num]) {
        seats[num] = true;
      } else {
        count++;
      }
    }
    System.out.println(count);
  }
}