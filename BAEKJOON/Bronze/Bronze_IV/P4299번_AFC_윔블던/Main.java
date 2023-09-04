package P4299번_AFC_윔블던;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int sum = Integer.parseInt(input[0]);
    int sub = Integer.parseInt(input[1]);
    boolean found = false;
    for (int i = 0; i < 1000; i++) {
      for (int j = 0; j <= i; j++) {
        if ((i + j) == sum && Math.abs(i - j) == sub) {
          found = true;
          System.out.println(i + " " + j);
          break;
        }
        if (found)
          break;
      }
    }
    if (!found)
      System.out.println("-1");
  }
}