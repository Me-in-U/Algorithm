package P15372번_A_simple_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      Long N = Long.parseLong(br.readLine());
      sb.append(N * N).append('\n');
    }
    System.out.print(sb.toString());
  }
}
