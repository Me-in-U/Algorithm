package P11653번_소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    for (int i = 2; i <= N; i++) {
      while (true) {
        if (N % i == 0) {
          N /= i;
          sb.append(i).append('\n');
        } else {
          break;
        }
      }
    }
    System.out.print(sb.toString());
  }
}