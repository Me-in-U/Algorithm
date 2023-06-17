package B번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    int k = Integer.parseInt(input[2]);
    int min = Integer.MAX_VALUE;
    int ban = Integer.MAX_VALUE;
    for (int i = 1; i <= k; i++) {
      input = br.readLine().split(" ");
      int f = Integer.parseInt(input[0]) - 1;
      int d = Integer.parseInt(input[1]) - 1;
      int dist = (f + (m - d));
      if (dist < min) {
        min = dist;
        ban = i;
      }
    }
    System.out.println(ban);
  }
}