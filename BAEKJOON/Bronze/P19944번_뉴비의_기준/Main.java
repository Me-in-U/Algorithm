package P19944번_뉴비의_기준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);
    if (M == 1 || M == 2) {
      System.out.println("NEWBIE!");
    } else if (M <= N) {
      System.out.println("OLDBIE!");
    } else {
      System.out.println("TLE!");
    }
  }
}