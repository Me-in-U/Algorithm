package P7595번_Triangles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = -1;
    StringBuilder sb = new StringBuilder();
    while ((n = Integer.parseInt(br.readLine())) != 0) {
      for (int i = 1; i <= n; i++) {
        for (int j = 0; j < i; j++) {
          sb.append('*');
        }
        sb.append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}