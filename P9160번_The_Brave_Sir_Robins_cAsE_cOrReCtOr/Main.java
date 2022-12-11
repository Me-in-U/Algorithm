package P9160번_The_Brave_Sir_Robins_cAsE_cOrReCtOr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String input = "";
    boolean to_upper = false;
    while ((input = br.readLine()) != null) {
      for (int i = 0; i < input.length(); i++) {
        char c1 = input.charAt(i);
        if (to_upper) {
          if (c1 == ' ' || c1 == '(' || c1 == ')') {
          } else if (c1 >= 'a' && c1 <= 'z') {
            c1 = (char) (c1 - 32);
            to_upper = false;
          } else {
            to_upper = false;
          }
        } else if (!to_upper && c1 >= 'A' && c1 <= 'Z') {
          c1 = (char) (c1 + 32);
        }
        if (c1 == '.' || c1 == '!' || c1 == '?') {
          to_upper = true;
        }
        sb.append(c1);
      }
      sb.append('\n');
    }
    System.out.print(sb);
  }
}
// c1 = (char) (c1 - 32); 대문자로
// c1 = (char) (c1 + 32); 소문자로
