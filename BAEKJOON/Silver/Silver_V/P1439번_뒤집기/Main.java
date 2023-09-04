package P1439번_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    StringTokenizer st0 = new StringTokenizer(input, "0");
    StringTokenizer st1 = new StringTokenizer(input, "1");
    int[] count = { 0, 0 };
    while (st0.hasMoreTokens()) {
      st0.nextToken();
      count[0]++;
    }
    while (st1.hasMoreTokens()) {
      st1.nextToken();
      count[1]++;
    }
    System.out.println(Math.min(count[0], count[1]));
  }
}