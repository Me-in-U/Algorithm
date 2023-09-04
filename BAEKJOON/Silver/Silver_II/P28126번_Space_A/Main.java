package Silver_II.P28126번_Space_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  public static HashSet<int[]> pos;
  public static String movement;
  public static int K, N, count;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    movement = br.readLine();
    K = Integer.parseInt(br.readLine());
    pos = new HashSet<>();
    for (int i = 0; i < K; i++) {
      String[] xy = br.readLine().split(" ");
      pos.add(new int[] { Integer.parseInt(xy[0]), Integer.parseInt(xy[1]) });
    }
    for (int i = 0; i < N; i++) {
      solve(i, 1, 1);
    }
    System.out.println(count);
  }

  public static void solve(int move, int x, int y) {
    if (pos.contains(new int[] { x, y })) {
      count++;
      pos.remove(new int[] { x, y });
    }
    if (pos.isEmpty() || move >= N) {
      return;
    }
    for (int i = move; i < N; i++) {
      char c = movement.charAt(i);
      if (c == 'R') {
        solve(i + 1, x + 1, y);
      } else if (c == 'U') {
        solve(i + 1, x, y + 1);
      } else if (c == 'X') {
        solve(i + 1, x + 1, y + 1);
      }
    }
  }
}