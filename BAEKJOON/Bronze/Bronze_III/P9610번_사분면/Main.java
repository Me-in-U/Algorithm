package P9610번_사분면;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int n = Integer.parseInt(br.readLine());
    int Q1 = 0;
    int Q2 = 0;
    int Q3 = 0;
    int Q4 = 0;
    int AXIS = 0;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      if (x == 0 || y == 0) {
        AXIS++;
      } else if (x > 0 && y > 0) {
        Q1++;
      } else if (x < 0 && y > 0) {
        Q2++;
      } else if (x < 0 && y < 0) {
        Q3++;
      } else {
        Q4++;
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append("Q1: ").append(Q1).append('\n');
    sb.append("Q2: ").append(Q2).append('\n');
    sb.append("Q3: ").append(Q3).append('\n');
    sb.append("Q4: ").append(Q4).append('\n');
    sb.append("AXIS: ").append(AXIS).append('\n');
    System.out.print(sb.toString());
  }
}