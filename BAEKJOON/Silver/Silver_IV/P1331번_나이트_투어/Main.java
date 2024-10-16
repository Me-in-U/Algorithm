package P1331번_나이트_투어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  protected static int[] moveX = { 1, 1, -1, -1, -2, 2, -2, 2 };
  protected static int[] moveY = { -2, 2, -2, 2, 1, 1, -1, -1 };
  protected static String[][] table = {
      { "A6", "B6", "C6", "D6", "E6", "F6" },
      { "A5", "B5", "C5", "D5", "E5", "F5" },
      { "A4", "B4", "C4", "D4", "E4", "F4" },
      { "A3", "B3", "C3", "D3", "E3", "F3" },
      { "A2", "B2", "C2", "D2", "E2", "F2" },
      { "A1", "B1", "C1", "D1", "E1", "F1" }
  };
  protected static int x = 0;
  protected static int y = 0;
  protected static String start;
  protected static String next;
  protected static boolean valid = true;
  protected static int[][] visited = new int[6][6];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    start = br.readLine();
    searchFirst();
    for (int i = 0; i < 35; i++) {
      next = br.readLine();
      if (valid) {
        search();
      }
    }
    visitCheck();
    lastCheck();
    if (valid) {
      System.out.println("Valid");
    } else {
      System.out.println("Invalid");
    }
  }

  public static void searchFirst() {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (table[i][j].equals(start)) {
          x = i;
          y = j;
          visited[i][j]++;
          return;
        }
      }
    }
  }

  public static void visitCheck() {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (visited[i][j] != 1) {
          valid = false;
          return;
        }
      }
    }
  }

  public static void lastCheck() {
    for (int i = 0; i < 8; i++) {
      int mayX = x + moveX[i];
      int mayY = y + moveY[i];
      if (0 <= mayX && mayX < 6 && 0 <= mayY && mayY < 6) {
        if (table[mayX][mayY].equals(start)) {
          return;
        }
      }
    }
    // System.out.println("처음으로 못감");
    valid = false;
  }

  public static void search() {
    for (int i = 0; i < 8; i++) {
      int mayX = x + moveX[i];
      int mayY = y + moveY[i];
      if (0 <= mayX && mayX < 6 && 0 <= mayY && mayY < 6) {
        if (table[mayX][mayY].equals(next)) {
          visited[mayX][mayY]++;
          x = mayX;
          y = mayY;
          return;
        }
      }
    }
    valid = false;
  }
}