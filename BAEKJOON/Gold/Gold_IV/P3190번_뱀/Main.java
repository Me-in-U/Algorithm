package P3190번_뱀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  private static boolean[][] apple;
  private static Deque<Integer> turnLeft = new ArrayDeque<>();
  private static Deque<Integer> turnRight = new ArrayDeque<>();
  private static LinkedList<int[]> snake = new LinkedList<>();
  private static int time = 0;
  private static int x = 0;
  private static int y = 0;
  private static int direction = 1;
  private static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // !입력
    n = Integer.parseInt(br.readLine());
    apple = new boolean[n][n];
    int k = Integer.parseInt(br.readLine());
    for (int i = 0; i < k; i++) {
      String[] applePos = br.readLine().split(" ");
      apple[Integer.parseInt(applePos[0]) - 1][Integer.parseInt(applePos[1]) - 1] = true;
    }
    int l = Integer.parseInt(br.readLine());
    for (int i = 0; i < l; i++) {
      String[] turnData = br.readLine().split(" ");
      if (turnData[1].equals("L"))
        turnLeft.add(Integer.parseInt(turnData[0]));
      else
        turnRight.add(Integer.parseInt(turnData[0]));
    }
    snake.add(new int[] { x, y });
    // !계산
    while (true) {
      time++;
      nextPos();
      if (!(wallCheck() && moveSnake()))
        break;
      appleCheck();
      turn();
    }
    // !출력
    System.out.println(time);
  }

  public static void nextPos() {
    if (direction == 0)
      x--;
    else if (direction == 1)
      y++;
    else if (direction == 2)
      x++;
    else if (direction == 3)
      y--;
  }

  public static boolean wallCheck() {
    return 0 <= x && 0 <= y && x < n && y < n;
  }

  public static boolean moveSnake() {
    for (int i = 0; i < snake.size(); i++) {
      if (snake.get(i)[0] == x && snake.get(i)[1] == y) {
        return false;
      }
    }
    snake.add(new int[] { x, y });
    return true;
  }

  public static void appleCheck() {
    if (apple[x][y]) {
      apple[x][y] = false;
    } else {
      snake.remove();
    }
  }

  public static void turn() {
    if (!turnLeft.isEmpty()) {
      if (turnLeft.peek() == time) {
        if (--direction == -1) {
          direction = 3;
        }
        turnLeft.removeFirst();
      }
    }
    if (!turnRight.isEmpty()) {
      if (turnRight.peek() == time) {
        if (++direction == 4) {
          direction = 0;
        }
        turnRight.removeFirst();
      }
    }
  }
}