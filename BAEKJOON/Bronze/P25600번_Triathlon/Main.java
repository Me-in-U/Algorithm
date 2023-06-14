package P25600번_Triathlon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int max = 0;
    for (int i = 0; i < N; i++) {
      int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if (input[0] == input[1] + input[2])
        max = Math.max(max, 2 * input[0] * (input[1] + input[2]));
      else
        max = Math.max(max, input[0] * (input[1] + input[2]));
    }
    System.out.println(max);
  }
}