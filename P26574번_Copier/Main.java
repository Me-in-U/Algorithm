package P26574번_Copier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      int c = Integer.parseInt(br.readLine());
      sb.append(c + " ").append(c).append('\n');
    }
    System.out.print(sb.toString());
  }
}