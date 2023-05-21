package A번_모비스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] count = new int[26];
    String line = br.readLine();
    for (int i = 0; i < line.length(); i++) {
      count[line.charAt(i) - 'A']++;
    }
    if (count[12] > 0 && count[14] > 0 && count[1] > 0 && count[8] > 0 && count[18] > 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}