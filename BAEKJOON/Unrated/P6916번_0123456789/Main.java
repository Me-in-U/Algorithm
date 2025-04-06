package BAEKJOON.Unrated.P6916번_0123456789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    if (n == 0 || n == 2 || n == 3 || n == 5 || n == 6 || n == 7 || n == 8 || n == 9) {
      sb.append(" * * *").append('\n');
    } else {
      sb.append('\n');
    }
    if (n == 0 || n == 4 || n == 8 || n == 9) {
      for (int i = 0; i < 3; i++) {
        sb.append("*     *").append('\n');
      }
    } else if (n == 1 || n == 2 || n == 3 || n == 7) {
      for (int i = 0; i < 3; i++) {
        sb.append("      *").append('\n');
      }
    } else {
      for (int i = 0; i < 3; i++) {
        sb.append("*").append('\n');
      }
    }
    if (n == 0 || n == 1 || n == 7) {
      sb.append('\n');
    } else {
      sb.append(" * * *").append('\n');
    }
    if (n == 0 || n == 6 || n == 8) {
      for (int i = 0; i < 3; i++) {
        sb.append("*     *").append('\n');
      }
    } else if (n == 1 || n == 3 || n == 4 || n == 5 || n == 7 || n == 9) {
      for (int i = 0; i < 3; i++) {
        sb.append("      *").append('\n');
      }
    } else {
      for (int i = 0; i < 3; i++) {
        sb.append("*").append('\n');
      }
    }
    if (n == 0 || n == 2 || n == 3 || n == 5 || n == 6 || n == 8 || n == 9) {
      sb.append(" * * *").append('\n');
    }
    System.out.print(sb.toString());
  }
}