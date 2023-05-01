package P10610번_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int[] numbers = new int[10];
    for (int i = 0; i < input.length(); i++) {
      numbers[input.charAt(i) - '0']++;
    }
    int sum = 0;
    for (int i = 1; i < 10; i++) {
      sum += i * numbers[i];
    }
    if (sum % 3 != 0 || numbers[0] == 0) {
      System.out.print("-1");
    } else {
      StringBuilder sb = new StringBuilder();
      for (int i = 9; i >= 0; i--) {
        for (int j = 0; j < numbers[i]; j++) {
          sb.append(i);
        }
      }
      System.out.print(sb);
    }
  }
}