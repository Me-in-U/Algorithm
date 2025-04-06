package BAEKJOON.Bronze.Bronze_IV.P29340번_Отряд;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String a = br.readLine();
    String b = br.readLine();
    for (int i = 0; i < a.length(); i++) {
      sb.append(a.charAt(i) > b.charAt(i) ? a.charAt(i) : b.charAt(i));
    }
    System.out.print(sb.toString());
  }
}
