package P9316번_Hello_Judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 1; i <= N; i++)
      sb.append("Hello World, Judge ").append(i).append("!").append('\n');
    System.out.print(sb.toString());
  }
}