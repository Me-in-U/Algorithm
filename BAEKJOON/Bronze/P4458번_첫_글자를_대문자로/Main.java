package P4458번_첫_글자를_대문자로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      char[] input = br.readLine().toCharArray();
      if (input[0] >= 'a' && input[0] <= 'z') {
        input[0] = (char) (input[0] - 32);
      }
      for (int j = 0; j < input.length; j++) {
        sb.append(input[j]);
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}