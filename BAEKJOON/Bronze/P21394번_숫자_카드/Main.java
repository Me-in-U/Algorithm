package P21394번_숫자_카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int[] num = new int[10];
      for (int j = 1; j < 10; j++) {
        num[j] = Integer.parseInt(st.nextToken());
      }
      String max = "";
      for (int j = 9; j >= 1; j--) {
        while (num[6] != 0) {
          max += Integer.toString(9);
          num[6]--;
        }
        while (num[j] != 0) {
          max += Integer.toString(j);
          num[j]--;
        }
      }
      // System.out.println("max" + max);
      String left = "";
      String right = "";
      for (int k = 0; k < max.length(); k++) {
        if (k % 2 == 0) {
          left += Integer.toString(max.charAt(k) - '0');
        } else {
          right += Integer.toString(max.charAt(k) - '0');
        }
      }
      for (int p = 0; p < left.length(); p++) {
        sb.append((left.charAt(p) - '0')).append(" ");
      }
      for (int p = right.length() - 1; p >= 0; p--) {
        sb.append((right.charAt(p) - '0')).append(" ");
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}