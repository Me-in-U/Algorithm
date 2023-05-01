package P1094번_막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int X = Integer.parseInt(br.readLine());
    int stick = 64;
    int count = 0;

    while (X > 0) {
      if (X < stick)
        stick /= 2;
      else {
        X -= stick;
        count++;
      }
    }
    System.out.println(count);
  }
}