package P28075번_스파이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  protected static int[][] behaviors;
  protected static int N;
  protected static int M;
  protected static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    N = Integer.parseInt(input[0]);
    M = Integer.parseInt(input[1]);
    behaviors = new int[2][3];
    for (int i = 0; i < 2; i++) {
      String[] input2 = br.readLine().split(" ");
      for (int j = 0; j < 3; j++) {
        behaviors[i][j] = Integer.parseInt(input2[j]);
      }
    }
    available(-1, 1, 0);
    System.out.println(count);
  }

  public static void available(int lastDaySpace, int day, int sum) {
    if (day == N + 1) {
      if (sum >= M) {
        count++;
      }
      return;
    }
    for (int mission = 0; mission < 2; mission++) {
      for (int spaces = 0; spaces < 3; spaces++) {
        if (lastDaySpace == spaces)
          available(spaces, day + 1, sum + (behaviors[mission][spaces] / 2));
        else
          available(spaces, day + 1, sum + behaviors[mission][spaces]);
      }
    }
  }
}