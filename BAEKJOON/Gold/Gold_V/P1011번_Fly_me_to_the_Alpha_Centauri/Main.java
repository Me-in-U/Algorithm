package Gold_V.P1011번_Fly_me_to_the_Alpha_Centauri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    while (T-- > 0) {
      int[] XY = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int distance = XY[1] - XY[0];
      int max = (int) Math.sqrt(distance);
      if ((int) Math.sqrt(distance) == Math.sqrt(distance)) {
        sb.append(max * 2 - 1);
      } else if (distance <= max * max + max) {
        sb.append(max * 2);
      } else {
        sb.append(max * 2 + 1);
      }
      sb.append('\n');
    }
    System.out.println(sb.toString().trim());
  }
}