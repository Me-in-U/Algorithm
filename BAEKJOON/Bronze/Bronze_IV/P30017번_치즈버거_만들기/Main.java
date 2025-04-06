package BAEKJOON.Bronze.Bronze_IV.P30017번_치즈버거_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int cheese = Math.min(A - 1, B);
    int result = 2 * cheese + 1;
    System.out.println(result);
  }
}