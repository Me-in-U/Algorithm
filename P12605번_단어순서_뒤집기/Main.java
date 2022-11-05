package P12605번_단어순서_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");
      sb.append("Case #").append(i + 1).append(": ");
      for (int j = input.length - 1; j >= 0; j--) {
        sb.append(input[j]).append(" ");
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}