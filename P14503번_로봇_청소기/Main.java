package P14503번_로봇_청소기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static int N, M, r, c, d, count;
  private static boolean[][] wall;
  private static boolean[][] cleaned;

  // 북, 동, 남, 서
  private static int[] dx = { -1, 0, 1, 0 };
  private static int[] dy = { 0, 1, 0, -1 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    wall = new boolean[N][M];
    cleaned = new boolean[N][M];
    count = 0;

    st = new StringTokenizer(br.readLine());
    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    d = Integer.parseInt(st.nextToken());

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++)
        if (Integer.parseInt(st.nextToken()) == 1)
          wall[i][j] = true;
    }

    search();
    System.out.println(count);
  }

  public static void search() {
    while (true) {
      // 1. 현재 칸이 아직 청소되지 않은 경우, 현재 칸을 청소한다.
      if (!cleaned[r][c]) {
        // System.out.println("(" + r + ", " + c + ")");
        cleaned[r][c] = true;
        count++;
      }
      // 2. 현재 칸의 주변 4칸 모두 청소가 이미 되어있거나 벽이면서
      if (_4way_clean()) {
        // 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
        if (!reverse_able())
          break;
        // 바라보는 방향을 유지한 채로 한 칸 후진할 수 있다면 한 칸 후진 1번으로 돌아간다.
        else
          go_back();
      } else { // 3. 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 있는 경우,
        // 3A. 반시계 방향으로 90도 회전한다.
        turn_left();
        // 3B. 바라보는 방향을 기준으로 앞쪽 칸이 청소되지 않은 빈 칸인 경우 한 칸 전진한다.
        if (front_trash_check())
          go_forward();
      }
    }
  }

  public static boolean front_trash_check() {
    int x = r;
    int y = c;
    if (d == 0)
      x--;
    else if (d == 1)
      y++;
    else if (d == 2)
      x++;
    else if (d == 3)
      y--;

    if (x >= 0 && y >= 0 && x < N && y < M) {
      if (!wall[x][y] && !cleaned[x][y])
        return true;
    }
    return false;
  }

  public static void turn_left() {
    if (--d == -1)
      d = 3;
  }

  public static boolean _4way_clean() {
    for (int i = 0; i < 4; i++) {
      int x = r + dx[i];
      int y = c + dy[i];
      if (x >= 0 && y >= 0 && x < N && y < M) {
        if (!wall[x][y] && !cleaned[x][y])
          return false;
      }
    }
    return true;
  }

  public static boolean reverse_able() {
    int x = r;
    int y = c;
    if (d == 0)
      x++;
    else if (d == 1)
      y--;
    else if (d == 2)
      x--;
    else if (d == 3)
      y++;

    if (x >= 0 && y >= 0 && x < N && y < M) {
      if (wall[x][y])
        return false;
    } else {
      return false;
    }
    return true;
  }

  public static void go_back() {
    if (d == 0)
      r++;
    else if (d == 1)
      c--;
    else if (d == 2)
      r--;
    else if (d == 3)
      c++;
  }

  public static void go_forward() {
    if (d == 0)
      r--;
    else if (d == 1)
      c++;
    else if (d == 2)
      r++;
    else if (d == 3)
      c--;
  }
}