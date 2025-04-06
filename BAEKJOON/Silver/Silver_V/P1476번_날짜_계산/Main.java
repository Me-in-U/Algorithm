package BAEKJOON.Silver.Silver_V.P1476번_날짜_계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int E = 1;
    int S = 1;
    int M = 1;
    StringTokenizer st = new StringTokenizer(br.readLine());
    int E_goal = Integer.parseInt(st.nextToken());
    int S_goal = Integer.parseInt(st.nextToken());
    int M_goal = Integer.parseInt(st.nextToken());
    int year = 1;
    for (;;) {
      if (E_goal == E && S_goal == S && M_goal == M) {
        break;
      }
      E++;
      S++;
      M++;
      if (E == 16)
        E = 1;
      if (S == 29)
        S = 1;
      if (M == 20)
        M = 1;
      year++;
      // System.out.println(E + " " + S + " " + M + " - " + year);
    }
    System.out.println(year);
  }
}