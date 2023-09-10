package 브실컵.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= T; i++) {
      int rank = Integer.parseInt(br.readLine());
      if (rank <= 25) {
        sb.append("Case #").append(i).append(": World Finals").append('\n');
      } else if (rank <= 1000) {
        sb.append("Case #").append(i).append(": Round 3").append('\n');
      } else if (rank <= 4500) {
        sb.append("Case #").append(i).append(": Round 2").append('\n');
      } else {
        sb.append("Case #").append(i).append(": Round 1").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}