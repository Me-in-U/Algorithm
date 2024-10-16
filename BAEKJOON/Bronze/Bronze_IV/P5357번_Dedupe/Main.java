package P5357번_Dedupe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder result = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String input = br.readLine();
      StringBuilder sb = new StringBuilder();
      char ch = input.charAt(0);
      sb.append(ch);
      for (int j = 1; j < input.length(); j++) {
        if (input.charAt(j) != ch) {
          ch = input.charAt(j);
          sb.append(ch);
        }
      }
      result.append(sb).append('\n');
    }
    System.out.print(result.toString());
  }
}