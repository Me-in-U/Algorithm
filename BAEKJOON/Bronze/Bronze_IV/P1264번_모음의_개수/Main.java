package BAEKJOON.Bronze.Bronze_IV.P1264번_모음의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String input = "";
    char[] vowels = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };
    while (!(input = br.readLine()).equals("#")) {
      int count = 0;
      for (int i = 0; i < input.length(); i++) {
        char a = input.charAt(i);
        for (int j = 0; j < vowels.length; j++) {
          if (a == vowels[j]) {
            count++;
          }
        }
      }
      sb.append(count).append('\n');
    }
    System.out.print(sb.toString());
  }
}