package P16727번_ICPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int p1 = Integer.parseInt(input[0]);
    int s1 = Integer.parseInt(input[1]);
    input = br.readLine().split(" ");
    int s2 = Integer.parseInt(input[0]);
    int p2 = Integer.parseInt(input[1]);
    if (p1 + p2 == s1 + s2) {
      if (s1 == p2) {
        System.out.println("Penalty");
      } else if (s1 > p2) {
        System.out.println("Esteghlal");
      } else {
        System.out.println("Persepolis");
      }
    } else if (p1 + p2 < s1 + s2) {
      System.out.println("Esteghlal");
    } else {
      System.out.println("Persepolis");
    }
  }
}