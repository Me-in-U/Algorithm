package P9663번_NQueen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  public static int N;
  public static int count = 0;
  public static boolean[] Y;
  public static boolean[] slash;
  public static boolean[] backslash;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    Y = new boolean[N];
    slash = new boolean[2 * N];
    backslash = new boolean[2 * N];
    solve(0);
    System.out.println(count);
  }

  public static void solve(int x) {
    if (x == N) {
      count++;
      return;
    }

    for (int y = 0; y < N; y++) {
      if (!Y[y] && !slash[x + y] && !backslash[x - y + (N - 1)]) {
        Y[y] = true;
        slash[x + y] = true;
        backslash[x - y + (N - 1)] = true;
        solve(x + 1);
        Y[y] = false;
        slash[x + y] = false;
        backslash[x - y + (N - 1)] = false;
      }
    }
  }
}