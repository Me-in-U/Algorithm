package SSeeeeiinngg_DDoouubbllee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SSeeeeiinngg_DDoouubbllee {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder result = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String input = br.readLine();
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < input.length(); j++) {
        sb.append(input.charAt(j));
        sb.append(input.charAt(input.length() - 1 - j));
      }
      result.append(sb.toString()).append('\n');
    }
    System.out.print(result.toString());
  }
}