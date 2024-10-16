package P5988번_홀수일까_짝수일까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String num = br.readLine();
      sb.append((num.charAt(num.length() - 1) - '0') % 2 == 0 ? "even" : "odd").append('\n');
    }
    System.out.print(sb.toString());
  }
}