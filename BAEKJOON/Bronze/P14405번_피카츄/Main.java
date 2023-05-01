package P14405번_피카츄;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    boolean possible = true;
    int length = input.length();
    for (int i = 0; i < length;) {
      if (i <= length - 2 && input.charAt(i) == 'p' && input.charAt(i + 1) == 'i') {
        i += 2;
      } else if (i <= length - 2 && input.charAt(i) == 'k' && input.charAt(i + 1) == 'a') {
        i += 2;
      } else if (i <= length - 3 && input.charAt(i) == 'c' && input.charAt(i + 1) == 'h'
          && input.charAt(i + 2) == 'u') {
        i += 3;
      } else {
        possible = false;
        break;
      }
    }
    if (possible)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}