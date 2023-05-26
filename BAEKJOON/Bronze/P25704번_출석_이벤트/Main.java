package P25704번_출석_이벤트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int P = Integer.parseInt(br.readLine());
    if (5 <= N && N < 10) {
      P -= 500;
    } else if (10 <= N && N < 15) {
      P = Math.min(P - 500, P / 10 * 9);
    } else if (15 <= N && N < 20) {
      P = Math.min(P - 2000, P / 10 * 9);
    } else if (20 <= N) {
      P = Math.min(P - 2000, P / 4 * 3);
    }
    if (P < 0) {
      System.out.println(0);
    } else {
      System.out.println(P);
    }
  }
}