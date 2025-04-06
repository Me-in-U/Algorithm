package BAEKJOON.Silver.Silver_V.P1380번_귀걸이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int index = 1;
    int n = Integer.parseInt(br.readLine());

    while (true) {
      String[][] student = new String[n + 1][2];
      for (int i = 1; i <= n; i++) {
        student[i][0] = br.readLine();
        student[i][1] = "0"; // "1" 압수당함
      }

      while (true) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        if (!st.hasMoreTokens()) {
          n = num;
          break;
        } else {
          if (student[num][1].equals("0")) {
            student[num][1] = "1";
          } else {
            student[num][1] = "0";
          }
        }
      }

      for (int i = 1; i < student.length; i++) {
        if (student[i][1].equals("1")) {
          sb.append(index++).append(" ").append(student[i][0]).append('\n');
        }
      }

      if (n == 0)
        break;
    }
    System.out.print(sb);
  }
}