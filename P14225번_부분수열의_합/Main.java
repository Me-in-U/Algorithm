package P14225번_부분수열의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  private static boolean[] possible;
  private static int[] input;
  private static int N;
  private static int M;
  private static boolean[] visited;
  private static int sum;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    N = Integer.parseInt(br.readLine());
    input = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      input[i] = Integer.parseInt(st.nextToken());
    }
    possible = new boolean[(Arrays.stream(input).max().getAsInt() * N) + 2];
    for (int i = 1; i <= N; i++) {
      visited = new boolean[N];
      M = i;
      solve(0, 0);
    }
    for (int i = 1; i < possible.length; i++) {
      if (!possible[i]) {
        System.out.println(i);
        break;
      }
    }
  }

  public static void solve(int start, int depth) {
    if (M == depth) {
      possible[sum] = true;
      return;
    }
    for (int i = start; i < N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        sum += input[i];
        solve(i, depth + 1);
        visited[i] = false;
        sum -= input[i];
      }
    }
  }
}