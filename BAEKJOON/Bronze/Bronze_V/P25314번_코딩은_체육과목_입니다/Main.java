package BAEKJOON.Bronze.Bronze_V.P25314번_코딩은_체육과목_입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N / 4; i++) {
      sb.append("long ");
    }
    sb.append("int ");
    System.out.println(sb.toString());
  }
}