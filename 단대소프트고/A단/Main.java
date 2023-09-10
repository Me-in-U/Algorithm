package 단대소프트고.A단;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int count = 0;
    for (int i = 0; i < input.length() - 3; i++)
      if (input.substring(i, i + 4).equals("DKSH"))
        count++;
    System.out.println(count);
  }
}