package P5596번_시험_점수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int sum_Min = 0;
    int sum_Man = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 4; i++) {
      sum_Min += Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 4; i++) {
      sum_Man += Integer.parseInt(st.nextToken());
    }
    if (sum_Min >= sum_Man) {
      System.out.println(sum_Min);
    } else {
      System.out.println(sum_Man);
    }
  }
}