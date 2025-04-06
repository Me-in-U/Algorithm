package BAEKJOON.Bronze.Bronze_IV.P30031번_지폐_세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    int sum = 0;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int mm = Integer.parseInt(st.nextToken());
      if (mm == 136) {
        sum += 1000;
      } else if (mm == 142) {
        sum += 5000;
      } else if (mm == 148) {
        sum += 10000;
      } else {
        sum += 50000;
      }
    }
    System.out.println(sum);
  }
}