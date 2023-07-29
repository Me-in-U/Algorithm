package P10188번_Quadrilateral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    String[] input;
    for (int i = 0; i < n; i++) {
      input = br.readLine().split(" ");
      int l = Integer.parseInt(input[0]);
      int w = Integer.parseInt(input[1]);
      for (int j = 0; j < w; j++) {
        for (int j2 = 0; j2 < l; j2++) {
          sb.append('X');
        }
        sb.append('\n');
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}