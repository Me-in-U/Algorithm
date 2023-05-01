package P1357번_뒤집힌_덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int X = Integer.parseInt(st.nextToken());
    int Y = Integer.parseInt(st.nextToken());
    System.out.println(Rev(Rev(X) + Rev(Y)));
  }

  public static int Rev(int a) {
    String input = String.valueOf(a);
    StringBuilder sb = new StringBuilder();
    for (int i = input.length() - 1; i >= 0; i--) {
      sb.append(input.charAt(i));
    }
    return Integer.parseInt(sb.toString());
  }
}