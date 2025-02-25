package Add_Plus_Minus_Sign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add_Plus_Minus_Sign {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      String line = br.readLine();
      boolean one = false;
      for (int j = 0; j < N; j++) {
        char c = line.charAt(j);
        if (j != 0) {
          if (c == '0') {
            sb.append('+');
          } else if (one) {
            sb.append('-');
            one = false;
          } else {
            sb.append('+');
            one = true;
          }
        } else {
          if (c == '1') {
            one = true;
          }
        }
      }
      System.out.println(sb.toString());
    }
  }
}