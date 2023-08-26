package P22155번_Простаязадача;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int f = Integer.parseInt(st.nextToken());
      sb.append((i <= 1 && f <= 2) || (i <= 2 && f <= 1) ? "Yes\n" : "No\n");
    }
    System.out.print(sb.toString());
  }
}
