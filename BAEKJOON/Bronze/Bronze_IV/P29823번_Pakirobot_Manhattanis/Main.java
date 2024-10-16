package P29823번_Pakirobot_Manhattanis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String input = br.readLine();
    int horizontal = 0;
    int vertical = 0;
    for (int i = 0; i < N; i++) {
      char c = input.charAt(i);
      if (c == 'N') {
        vertical++;
      } else if (c == 'S') {
        vertical--;
      } else if (c == 'W') {
        horizontal--;
      } else if (c == 'E') {
        horizontal++;
      }
    }
    System.out.println(Math.abs(vertical) + Math.abs(horizontal));
  }
}