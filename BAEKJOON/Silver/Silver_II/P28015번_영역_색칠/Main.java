package BAEKJOON.Silver.P28015번_영역_색칠;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  protected static int[][] paper;
  protected static int N;
  protected static int M;
  protected static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    for (int i = 0; i < N; i++) {
      String replace = br.readLine()
          .replaceAll(" ", "").replaceAll("0", " ").replaceAll("\\s+", " ")
          .trim();
      if (!replace.equals("")) {
        String[] subStr = replace.split(" ");
        count += subStr.length;
        // System.out.println("초기 count = " + count);
        for (int j = 0; j < subStr.length; j++) {
          int op1 = overPaint1(subStr[j]);
          int op2 = overPaint2(subStr[j]);
          // System.out.println((i + 1) + "줄 " + (j + 1) + "번째 " + op1 + " " + op2);
          count += Math.min(op1, op2);
        }
      }
    }
    System.out.println(count);
  }

  public static int overPaint1(String line) {
    int over1 = 0;
    boolean toPrint = false;
    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) == '0' || line.charAt(i) == '2') {
        toPrint = false;
      } else if (line.charAt(i) == '1') {
        if (!toPrint)
          over1++;
        toPrint = true;
      }
    }
    return over1;
  }

  public static int overPaint2(String line) {
    int over2 = 0;
    boolean toPrint = false;
    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) == '0' || line.charAt(i) == '1') {
        toPrint = false;
      } else if (line.charAt(i) == '2') {
        if (!toPrint)
          over2++;
        toPrint = true;
      }
    }
    return over2;
  }
}
