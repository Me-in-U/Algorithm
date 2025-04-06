package BAEKJOON.Gold.Gold_III.P1701번_Cubeditor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    char[] chars = input.toCharArray();
    int inputLength = input.length();
    int max = 0;
    for (int index = 0; index < inputLength; index++) {
      int[] pmt = new int[inputLength - index];
      int length = 0;
      for (int i = index + 1; i < inputLength; i++) {
        while (length > 0 && chars[i] != chars[index + length]) {
          length = pmt[length - 1];
        }
        if (chars[i] == chars[index + length]) {
          length++;
          pmt[i - index] = length;
        }
        max = Math.max(max, pmt[i - index]);
      }
    }
    System.out.println(max);
  }
}
