package BAEKJOON.Silver.Silver_III.P1063번_킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static String[][] chess = {
      { "A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8" },
      { "A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7" },
      { "A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6" },
      { "A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5" },
      { "A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4" },
      { "A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3" },
      { "A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2" },
      { "A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1" },
  };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String king = st.nextToken();
    int[] king_pos = new int[2];
    String dol = st.nextToken();
    int[] dol_pos = new int[2];
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (chess[i][j].equals(king)) {
          king_pos[0] = i;
          king_pos[1] = j;
          i = 8;
          break;
        }
      }
    }
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (chess[i][j].equals(dol)) {
          dol_pos[0] = i;
          dol_pos[1] = j;
          i = 8;
          break;
        }
      }
    }
    int N = Integer.parseInt(st.nextToken());
    for (int i = 0; i < N; i++) {
      String move = br.readLine();
      int move_x = 0;
      int move_y = 0;
      if (move.equals("R")) {
        move_y = 1;
      } else if (move.equals("L")) {
        move_y = -1;
      } else if (move.equals("B")) {
        move_x = 1;
      } else if (move.equals("T")) {
        move_x = -1;
      } else if (move.equals("RT")) {
        move_x = -1;
        move_y = 1;
      } else if (move.equals("LT")) {
        move_x = -1;
        move_y = -1;
      } else if (move.equals("RB")) {
        move_x = 1;
        move_y = 1;
      } else if (move.equals("LB")) {
        move_x = 1;
        move_y = -1;
      }
      int[] king_next = new int[] { king_pos[0] + move_x, king_pos[1] + move_y };
      int[] dol_next = new int[] { dol_pos[0] + move_x, dol_pos[1] + move_y };
      if (king_next[0] == dol_pos[0] && king_next[1] == dol_pos[1]) {
        if (dol_next[0] >= 0 && dol_next[0] < 8 && dol_next[1] >= 0 && dol_next[1] < 8) {
          king_pos[0] = king_next[0];
          king_pos[1] = king_next[1];
          dol_pos[0] = dol_next[0];
          dol_pos[1] = dol_next[1];
        }
      } else {
        if (king_next[0] >= 0 && king_next[0] < 8 && king_next[1] >= 0 && king_next[1] < 8) {
          king_pos[0] = king_next[0];
          king_pos[1] = king_next[1];
        }
      }
    }
    System.out.println(chess[king_pos[0]][king_pos[1]]);
    System.out.println(chess[dol_pos[0]][dol_pos[1]]);
  }
}