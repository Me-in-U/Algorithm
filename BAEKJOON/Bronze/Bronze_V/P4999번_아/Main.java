package BAEKJOON.Bronze.Bronze_V.P4999번_아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String jh = br.readLine();
    String doc = br.readLine();
    if (jh.length() >= doc.length()) {
      System.out.println("go");
    } else {
      System.out.println("no");
    }
  }
}
