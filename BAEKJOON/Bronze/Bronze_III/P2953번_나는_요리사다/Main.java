package BAEKJOON.Bronze.Bronze_III.P2953번_나는_요리사다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int num = 0;
    int max = 0;
    for (int i = 1; i <= 5; i++) {
      st = new StringTokenizer(br.readLine());
      int sum = 0;
      for (int j = 0; j < 4; j++) {
        sum += Integer.parseInt(st.nextToken());
      }
      if (max < sum) {
        max = sum;
        num = i;
      }
    }
    System.out.println(num + " " + max);
  }
}
