package BAEKJOON.Bronze.Bronze_I.P29724번_사과상자에_들어있는_것은_무엇_현금;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    int appleBoxWeight = 0;
    int baeBoxWeight = 0;
    int totalApples = 0;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      char c = st.nextToken().charAt(0);
      if (c == 'A') {
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int apples = (W / 12) * (H / 12) * (L / 12);
        appleBoxWeight += 1000 + (apples * 500);
        totalApples += apples;
      } else {
        baeBoxWeight += 6000;
      }
    }
    System.out.println((appleBoxWeight + baeBoxWeight));
    System.out.println(totalApples * 4000);
  }
}