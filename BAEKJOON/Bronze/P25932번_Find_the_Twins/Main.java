package P25932번_Find_the_Twins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      st = new StringTokenizer(line);
      boolean mack = false;// 18
      boolean zack = false; // 17
      for (int j = 0; j < 10; j++) {
        int num = Integer.parseInt(st.nextToken());
        if (num == 18) {
          mack = true;
        } else if (num == 17) {
          zack = true;
        }
      }
      sb.append(line).append('\n');
      if (mack && zack) {
        sb.append("both");
      } else if (mack) {
        sb.append("mack");
      } else if (zack) {
        sb.append("zack");
      } else {
        sb.append("none");
      }
      sb.append("\n\n");
    }
    System.out.print(sb.toString().trim());
  }
}