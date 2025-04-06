package BAEKJOON.Silver.Silver_II.P21736번_헌내기는_친구가_필요해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  protected static int n;
  protected static int m;
  protected static boolean[][] people;
  protected static boolean[][] visitedOrWall;
  protected static int meet = 0;

  public static class Coordinates {
    int x;
    int y;

    Coordinates(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    people = new boolean[n][m];
    visitedOrWall = new boolean[n][m];
    char[] input = null;
    Coordinates start = null;
    for (int i = 0; i < n; i++) {
      input = br.readLine().toCharArray();
      for (int j = 0; j < m; j++) {
        char c = input[j];
        if (c == 'O') {
          continue;
        } else if (c == 'X') {
          visitedOrWall[i][j] = true;
        } else if (c == 'P') {
          people[i][j] = true;
        } else if (c == 'I') {
          start = new Coordinates(i, j);
          visitedOrWall[i][j] = true;
        }
      }
    }
    BFS(start);
    System.out.println(meet == 0 ? "TT" : meet);
  }

  public static void BFS(Coordinates start) {
    int[] moveX = { 0, 0, -1, 1 };
    int[] moveY = { -1, 1, 0, 0 };

    Queue<Coordinates> mainQueue = new ArrayDeque<>();
    mainQueue.add(start);
    while (true) {
      Queue<Coordinates> temp = new ArrayDeque<>();
      while (!mainQueue.isEmpty()) {
        Coordinates pos = mainQueue.poll();
        for (int i = 0; i < 4; i++) {
          int nextX = pos.x + moveX[i];
          int nextY = pos.y + moveY[i];
          if (0 <= nextX && 0 <= nextY && nextX < n && nextY < m) {
            if (!visitedOrWall[nextX][nextY]) {
              if (people[nextX][nextY]) {
                meet++;
              }
              visitedOrWall[nextX][nextY] = true;
              temp.add(new Coordinates(nextX, nextY));
            }
          }
        }
      }
      if (temp.isEmpty()) {
        break;
      } else {
        mainQueue = temp;
      }
    }
  }
}