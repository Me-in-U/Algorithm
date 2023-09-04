package P11282번_한글;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char hangul = (char) (44031 + Integer.parseInt(br.readLine()));
    System.out.println(hangul);
  }
}