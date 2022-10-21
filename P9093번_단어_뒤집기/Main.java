package P9093번_단어_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        String token = st.nextToken();
        for (int index = token.length() - 1; index >= 0; index--) {
          sb.append(token.charAt(index));
        }
        sb.append(" ");
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}