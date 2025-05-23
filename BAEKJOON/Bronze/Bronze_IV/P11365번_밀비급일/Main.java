package BAEKJOON.Bronze.Bronze_IV.P11365번_밀비급일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String line = "";
    while (!(line = br.readLine()).equals("END")) {
      for (int i = line.length() - 1; i >= 0; i--) {
        sb.append(line.charAt(i));
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}