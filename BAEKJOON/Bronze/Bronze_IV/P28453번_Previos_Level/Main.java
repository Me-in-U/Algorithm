package P28453번_Previos_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    while (n-- > 0) {
      int m = Integer.parseInt(st.nextToken());
      if (m == 300) {
        sb.append("1 ");
      } else if (m >= 275) {
        sb.append("2 ");
      } else if (m >= 250) {
        sb.append("3 ");
      } else {
        sb.append("4 ");
      }
    }
    System.out.print(sb.toString());
  }
}