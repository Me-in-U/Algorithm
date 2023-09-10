package 브실컵.Y;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int score = 0;
    for (int i = 0; i < 8; i++) {
      char[] line = br.readLine().toCharArray();
      for (int j = 0; j < 8; j++) {
        if (line[j] == 'P') {
          score += 1;
        } else if (line[j] == 'p') {
          score -= 1;
        } else if (line[j] == 'N' || line[j] == 'B') {
          score += 3;
        } else if (line[j] == 'n' || line[j] == 'b') {
          score -= 3;
        } else if (line[j] == 'R') {
          score += 5;
        } else if (line[j] == 'r') {
          score -= 5;
        } else if (line[j] == 'Q') {
          score += 9;
        } else if (line[j] == 'q') {
          score -= 9;
        }
      }
    }
    System.out.println(score);
  }
}