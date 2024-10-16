package P26004번_HIARC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String input = br.readLine();
    int min = 100000;
    int[] count = new int[5];
    for (int i = 0; i < N; i++) {
      char c = input.charAt(i);
      if (c == 'H') {
        count[0]++;
      } else if (c == 'I') {
        count[1]++;
      } else if (c == 'A') {
        count[2]++;
      } else if (c == 'R') {
        count[3]++;
      } else if (c == 'C') {
        count[4]++;
      }
    }

    for (int i = 0; i < 5; i++) {
      // System.out.println(count[i]);
      if (count[i] == 0) {
        min = 0;
        break;
      } else if (count[i] < min) {
        min = count[i];
      }
    }
    System.out.println(min);
  }
}