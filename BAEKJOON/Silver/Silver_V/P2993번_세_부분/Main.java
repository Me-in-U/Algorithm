package BAEKJOON.Silver.Silver_V.P2993번_세_부분;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    String[] result = { "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "" };
    for (int k = 1; k <= input.length() - 2; k++) {
      for (int h = k + 1; h <= input.length() - 1; h++) {
        String a = input.substring(0, k);
        String b = input.substring(k, h);
        String c = input.substring(h, input.length());

        // System.out.println(a + " " + b + " " + c);
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--)
          sb.append(String.valueOf(a.charAt(i)));
        for (int i = b.length() - 1; i >= 0; i--)
          sb.append(String.valueOf(b.charAt(i)));
        for (int i = c.length() - 1; i >= 0; i--)
          sb.append(String.valueOf(c.charAt(i)));

        String rebuild = sb.toString();
        result[1] = rebuild;
        Arrays.sort(result);
      }
    }
    System.out.println(result[0]);
  }
}