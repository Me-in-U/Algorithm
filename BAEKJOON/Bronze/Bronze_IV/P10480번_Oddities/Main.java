package Bronze_IV.P10480번_Oddities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());
      if (Math.abs(x) % 2 == 0) {
        sb.append(x).append(" is even").append('\n');
      } else {
        sb.append(x).append(" is odd").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}