package Silver_I.P20529번_가장_가까운_세_사람의_심리적_거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      if (32 < N) {
        br.readLine();
        sb.append('0').append('\n');
      } else {
        sb.append(getResult(br.readLine().split(" "))).append('\n');
      }
    }
    System.out.print(sb.toString());
  }

  public static int getResult(String[] input) {
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < input.length - 2; i++) {
      for (int j = i + 1; j < input.length - 1; j++) {
        for (int k = j + 1; k < input.length; k++) {
          result = Math.min(result,
              compare(input[i], input[j]) + compare(input[j], input[k]) + compare(input[k], input[i]));
        }
      }
    }
    return result;
  }

  public static int compare(String a, String b) {
    int distance = 0;
    for (int i = 0; i < 4; i++) {
      if (a.charAt(i) != b.charAt(i)) {
        distance++;
      }
    }
    return distance;
  }
}