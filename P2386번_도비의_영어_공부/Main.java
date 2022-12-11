package P2386번_도비의_영어_공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine());
      char a = st.nextToken().charAt(0);
      if (a == '#') {
        break;
      }
      int count = 0;
      while (st.hasMoreTokens()) {
        String b = st.nextToken();
        for (int i = 0; i < b.length(); i++)
          if (b.charAt(i) == a || b.charAt(i) == (char) (a - 32))
            count++;
      }
      sb.append(a + " " + count).append('\n');
    }
    System.out.print(sb.toString());
  }
}