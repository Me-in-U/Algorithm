package BAEKJOON.Bronze.Bronze_III.P2914번_저작권;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int I = Integer.parseInt(st.nextToken());

    System.out.println((A * (I - 1)) + 1);
  }
}