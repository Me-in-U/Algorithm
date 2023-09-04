package P28063번_동전_복사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");
    int x = Integer.parseInt(input[0]);
    int y = Integer.parseInt(input[1]);
    if (x == 1 && y == 1 && N == 1) {
      System.out.println(0);
    } else {
      if ((x == 1 || x == N) && (y == 1 || y == N)) {
        System.out.println(2);
      } else if ((x == 1 || x == N) && (y != 1 || y != N)) {
        System.out.println(3);
      } else if ((x != 1 || x != N) && (y == 1 || y == N)) {
        System.out.println(3);
      } else {
        System.out.println(4);
      }
    }
  }
}