package P26772번_Poziome_serca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] heart = {
        " @@@   @@@  ",
        "@   @ @   @ ",
        "@    @    @ ",
        "@         @ ",
        " @       @  ",
        "  @     @   ",
        "   @   @    ",
        "    @ @     ",
        "     @      "
    };
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < n; j++) {
        sb.append(heart[i]);
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}