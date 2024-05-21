package BAEKJOON.Bronze.Bronze_III.P29720번_그래서_님_푼_문제_수가;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int min = N - M * K;
    int max = min + M - 1;
    System.out.print((min < 0 ? 0 : min) + " " + (max < 0 ? 0 : max));
  }
}