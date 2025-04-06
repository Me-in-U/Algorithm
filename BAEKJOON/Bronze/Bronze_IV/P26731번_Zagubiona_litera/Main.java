package BAEKJOON.Bronze.Bronze_IV.P26731번_Zagubiona_litera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    boolean[] letters = new boolean[26];
    for (int i = 0; i < input.length(); i++) {
      letters[input.charAt(i) - 'A'] = true;
    }
    for (int i = 0; i < letters.length; i++) {
      if (!letters[i]) {
        System.out.println((char) (i + 'A'));
        break;
      }
    }
  }
}