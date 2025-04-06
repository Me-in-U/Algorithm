package BAEKJOON.Bronze.Bronze_II.P2789번_유학_금지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    char[] CAMBRIDGE = "CAMBRIDGE".toCharArray();
    for (int i = 0; i < CAMBRIDGE.length; i++) {
      input = input.replace(String.valueOf(CAMBRIDGE[i]), "");
    }
    System.out.print(input);
  }
}