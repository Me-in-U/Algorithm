package P25703번_포인터_공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    sb.append("int a;").append('\n').append("int *ptr = &a;").append('\n');
    for (int i = 2; i <= N; i++) {
      sb.append("int ");
      for (int j = 0; j < i; j++) {
        sb.append("*");
      }
      sb.append("ptr").append(i).append(" = &ptr");
      if (i != 2) {
        sb.append(i - 1).append(";\n");
      } else {
        sb.append(";\n");
      }
    }
    System.out.print(sb.toString());
  }
}