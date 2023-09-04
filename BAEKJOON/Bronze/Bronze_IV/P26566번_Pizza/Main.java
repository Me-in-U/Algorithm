package P26566번_Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = null;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int a1 = Integer.parseInt(st.nextToken());
      int p1 = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int r1 = Integer.parseInt(st.nextToken());
      int p2 = Integer.parseInt(st.nextToken());
      double slice = a1 / (double) p1;
      double circular = (Math.PI * r1 * r1) / p2;
      sb.append(slice > circular ? "Slice of pizza" : "Whole pizza").append('\n');
    }
    System.out.print(sb.toString());
  }
}