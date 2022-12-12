package P11656번_접미사_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    String[] arr = new String[input.length()];

    for (int i = 0; i < input.length(); i++) {
      arr[i] = input.substring(input.length() - 1 - i, input.length());
    }
    Arrays.sort(arr);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      sb.append(arr[i]).append('\n');
    }
    System.out.print(sb.toString());
  }
}