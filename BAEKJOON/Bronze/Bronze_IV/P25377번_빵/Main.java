package P25377번_빵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int time = 1001;
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");
      int A = Integer.parseInt(input[0]);
      int B = Integer.parseInt(input[1]);
      if (A <= B) {
        time = Math.min(time, Math.max(A, B));
      }
    }
    if (time == 1001) {
      System.out.println(-1);
    } else {
      System.out.println(time);
    }
  }
}