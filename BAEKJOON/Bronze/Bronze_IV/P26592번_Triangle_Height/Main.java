package P26592번_Triangle_Height;

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
      double area = Double.parseDouble(st.nextToken());
      double baseLength = Double.parseDouble(st.nextToken());
      double height = (2 * area) / baseLength;
      sb.append("The height of the triangle is ").append(String.format("%.2f", height)).append(" units\n");
    }
    System.out.print(sb.toString());
  }
}