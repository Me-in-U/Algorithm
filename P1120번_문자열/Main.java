package P1120번_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int maxCommon = 0;
    for (int i = 0; i < input[1].length() - input[0].length() + 1; i++) {
      int count = 0;
      String subString = input[1].substring(i, i + input[0].length());
      for (int j = 0; j < input[0].length(); j++) {
        if (input[0].charAt(j) == subString.charAt(j)) {
          count++;
        }
      }
      maxCommon = Math.max(maxCommon, count);
    }
    System.out.println(input[0].length() - maxCommon);
  }
}