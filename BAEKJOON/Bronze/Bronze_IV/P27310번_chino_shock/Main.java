package BAEKJOON.Bronze.Bronze_IV.P27310번_chino_shock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int colon = 1;
    int underscore = 0;
    for (int i = 6; i < line.length(); i++) {
      char c = line.charAt(i);
      if (c == '_') {
        underscore++;
      } else if (c == ':') {
        colon++;
      }
    }
    System.out.println(line.length() + colon + underscore * 5);
  }
}
