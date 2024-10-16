package P9613번_GCD_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      Integer[] numbers = new Integer[n];
      for (int j = 0; j < n; j++) {
        numbers[j] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(numbers, Collections.reverseOrder());
      long sum = 0;
      for (int y = 0; y < n - 1; y++) {
        for (int x = y + 1; x < n; x++) {
          sum += gcd(numbers[x], numbers[y]);
        }
      }
      sb.append(sum).append('\n');
    }
    System.out.print(sb.toString());
  }

  // x가 작은수, y가 큰수
  public static int gcd(int x, int y) {
    return (y == 0) ? x : gcd(y, x % y);
  }
}