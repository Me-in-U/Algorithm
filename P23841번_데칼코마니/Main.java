package P23841번_데칼코마니;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] lines = br.readLine().split(" ");
    int N = Integer.parseInt(lines[0]);
    int M = Integer.parseInt(lines[1]);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      char[] decal = br.readLine().toCharArray();
      for (int j = 0; j < M / 2; j++) {
        if ('A' <= decal[j] || decal[j] == 'Z') {
          decal[M - 1 - j] = decal[j];
        } else if ('A' <= decal[M - 1 - j] || decal[M - 1 - j] == 'Z') {
          decal[j] = decal[M - 1 - j];
        }
      }
      for (int k = 0; k < M; k++) {
        sb.append(decal[k]);
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}