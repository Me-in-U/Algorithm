package P18698번_The_Walking_Adam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      String line = br.readLine();
      int count = 0;
      for (int j = 0; j < line.length(); j++) {
        if (line.charAt(j) == 'U') {
          count++;
        } else {
          break;
        }
      }
      sb.append(count).append('\n');
    }
    System.out.print(sb.toString());
  }
}