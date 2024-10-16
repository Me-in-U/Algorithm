package P30224번_Lucky7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    char[] inputChars = input.toCharArray();
    boolean exist7 = false;
    for (char c : inputChars) {
      if (c == '7') {
        exist7 = true;
      }
    }
    boolean divideBy7 = Integer.parseInt(input) % 7 == 0;
    if (!exist7 && !divideBy7) {
      System.out.println(0);
    } else if (!exist7 && divideBy7) {
      System.out.println(1);
    } else if (exist7 && !divideBy7) {
      System.out.println(2);
    } else if (exist7 && divideBy7) {
      System.out.println(3);
    }
  }
}