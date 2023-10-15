package Platinum_IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int L = Integer.parseInt(br.readLine());
    String pattern = br.readLine();
    int[] pmt = new int[L];
    int length = 0;
    for (int i = 1; i < L; i++) {
      while (length != 0 && pattern.charAt(i) != pattern.charAt(length)) {
        length = pmt[length - 1];
      }
      if (pattern.charAt(i) == pattern.charAt(length)) {
        pmt[i] = ++length;
      }
    }
    System.out.println(L - pmt[L - 1]);
  }
}