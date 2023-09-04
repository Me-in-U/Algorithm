package BAEKJOON.Bronze.P26340번_Fold_the_Paper_Nicely;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int side1 = Integer.parseInt(st.nextToken());
      int side2 = Integer.parseInt(st.nextToken());
      int folds = Integer.parseInt(st.nextToken());
      sb.append("Data set: ").append(side1).append(' ').append(side2).append(' ').append(folds).append('\n');
      for (int j = 0; j < folds; j++) {
        if (side1 >= side2) {
          side1 /= 2;
        } else {
          side2 /= 2;
        }
      }
      if (side1 >= side2) {
        sb.append(side1).append(' ').append(side2).append("\n\n");
      } else {
        sb.append(side2).append(' ').append(side1).append("\n\n");
      }
    }
    System.out.print(sb.toString());
  }
}