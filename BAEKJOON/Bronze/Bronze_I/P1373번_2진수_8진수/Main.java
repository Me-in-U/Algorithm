package P1373번_2진수_8진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String input = br.readLine();
    if (input.length() % 3 == 2)
      input = "0" + input;
    else if (input.length() % 3 == 1)
      input = "00" + input;

    for (int i = 0; i < input.length(); i += 3) {
      int sum = 0;
      for (int j = 0; j < 3; j++) {
        if (input.charAt(i + j) == '1') {
          if (j == 0)
            sum += 4;
          else if (j == 1)
            sum += 2;
          else
            sum += 1;
        }
      }
      sb.append(sum);
    }
    System.out.println(sb.toString());
  }
}