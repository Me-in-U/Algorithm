package P4504번_배수_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int a = -1;
    while ((a = Integer.parseInt(br.readLine())) != 0) {
      sb.append(a);
      if (a % n == 0) {
        sb.append(" is a multiple of ");
      } else {
        sb.append(" is NOT a multiple of ");
      }
      sb.append(n).append(".\n");
    }
    System.out.print(sb.toString());
  }
}