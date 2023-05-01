package P2563번_색종이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[][] dohwaji = new boolean[100][100];
    int cP = Integer.parseInt(br.readLine());
    for (int i = 0; i < cP; i++) {
      String[] xy = br.readLine().split(" ");
      int x = Integer.parseInt(xy[0]) - 1;
      int y = Integer.parseInt(xy[1]) - 1;
      for (int xpos = x; xpos < x + 10; xpos++)
        for (int ypos = y; ypos < y + 10; ypos++)
          dohwaji[xpos][ypos] = true;
    }
    int result = 0;
    for (int i = 0; i < 100; i++)
      for (int j = 0; j < 100; j++)
        if (dohwaji[i][j])
          result++;
    System.out.println(result);
  }
}