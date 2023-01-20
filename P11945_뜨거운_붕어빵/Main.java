package P11945_뜨거운_붕어빵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      for (int j = M - 1; j >= 0; j--) {
        sb.append(line.charAt(j));
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}