package P26500번_Absolutely;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      double[] d = { Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()) };
      Arrays.sort(d);
      sb.append(String.format("%.1f", (d[1] - d[0]))).append('\n');
    }
    System.out.print(sb.toString());
  }
}