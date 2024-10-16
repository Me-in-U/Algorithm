package P3059번_등장하지_않는_문자의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      boolean[] al = new boolean[26];
      br.readLine().chars().forEach(c -> al[c - 'A'] = true);
      int sum = 0;
      for (int j = 0; j < al.length; j++)
        if (!al[j])
          sum += ('A' + j);
      sb.append(sum).append('\n');
    }
    System.out.print(sb.toString());
  }
}