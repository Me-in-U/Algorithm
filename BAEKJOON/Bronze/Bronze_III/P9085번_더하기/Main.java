package P9085번_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      int sum = 0;
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        sum += Integer.parseInt(st.nextToken());
      }
      sb.append(sum).append('\n');
    }
    System.out.print(sb.toString());
  }
}
