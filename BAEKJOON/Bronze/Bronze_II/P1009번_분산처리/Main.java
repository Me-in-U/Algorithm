package P1009번_분산처리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] data = new int[10][];
    data[0] = new int[] { 10 };
    data[1] = new int[] { 1 };
    data[2] = new int[] { 2, 4, 8, 6 };
    data[3] = new int[] { 3, 9, 7, 1 };
    data[4] = new int[] { 4, 6 };
    data[5] = new int[] { 5 };
    data[6] = new int[] { 6 };
    data[7] = new int[] { 7, 9, 3, 1 };
    data[8] = new int[] { 8, 4, 2, 6 };
    data[9] = new int[] { 9, 1 };
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      String a_str = st.nextToken();
      int a = a_str.charAt(a_str.length() - 1) - '0';
      int b = Integer.parseInt(st.nextToken());
      int result = data[a][(b - 1) % data[a].length];
      sb.append(result).append('\n');
    }
    System.out.print(sb.toString());
  }
}