package BAEKJOON.Bronze.Bronze_V.P30214번_An_Easy_Peasy_Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int halfSolved = Integer.parseInt(st.nextToken());
    int endSolved = Integer.parseInt(st.nextToken());
    System.out.println(halfSolved >= endSolved / 2.0 ? "E" : "H");
  }
}