package P26767번_Hurra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int i = 1; i <= n; i++) {
      if ((i % 7 == 0) && (i % 11 == 0)) {
        sb.append("Wiwat!");
      } else if ((i % 7 != 0) && (i % 11 == 0)) {
        sb.append("Super!");
      } else if ((i % 7 == 0) && (i % 11 != 0)) {
        sb.append("Hurra!");
      } else {
        sb.append(i);
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}