package BAEKJOON.Bronze.Bronze_II.P5598번_카이사르_암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String line = br.readLine();
    for (int i = 0; i < line.length(); i++) {
      char a = line.charAt(i);
      if (a - 3 < 'A')
        a += 23;
      else
        a -= 3;
      sb.append(a);
    }
    System.out.println(sb.toString());
  }
}
