package P10769번_행복한지_슬픈지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int happy = 0;
    int sad = 0;

    String input = br.readLine();
    for (int i = 0; i < input.length() - 2; i++) {
      if (input.charAt(i) == ':') {
        if (input.charAt(i + 1) == '-') {
          if (input.charAt(i + 2) == ')') {
            happy++;
          } else if (input.charAt(i + 2) == '(') {
            sad++;
          }
        }
      }
    }
    if (happy == 0 && sad == 0) {
      System.out.println("none");
    } else if (happy > sad) {
      System.out.println("happy");
    } else if (happy < sad) {
      System.out.println("sad");
    } else {
      System.out.println("unsure");
    }
    StringBuilder sb = new StringBuilder();
  }
}