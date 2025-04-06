package BAEKJOON.Bronze.Bronze_IV.P17863번_FYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(br.readLine().substring(0, 3).equals("555") ? "YES" : "NO");
  }
}