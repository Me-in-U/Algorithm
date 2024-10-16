package P2476번_주사위_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int max = 0;
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      int a = line.charAt(0) - '0';
      int b = line.charAt(2) - '0';
      int c = line.charAt(4) - '0';
      if (a == b && b == c) {
        max = Math.max(max, 10000 + a * 1000);
      } else if (a == b) {
        max = Math.max(max, 1000 + a * 100);
      } else if (b == c) {
        max = Math.max(max, 1000 + b * 100);
      } else if (c == a) {
        max = Math.max(max, 1000 + c * 100);
      } else {
        max = Math.max(max, Math.max(a, Math.max(b, c)) * 100);
      }
    }
    System.out.println(max);
  }
}