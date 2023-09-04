package P16200번_해커톤;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int Y = 0;
    int M = 0;
    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      Y += 10 + (10 * (num / 30));
      M += 15 + (15 * (num / 60));
    }

    if (Y < M) {
      System.out.println("Y " + Y);
    } else if (Y > M) {
      System.out.println("M " + M);
    } else if (Y == M) {
      System.out.println("Y M " + M);
    }
  }
}