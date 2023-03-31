package P13410번_거꾸로_구구단;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);
    int max = 0;
    for (int i = 1; i <= K; i++) {
      StringBuilder sb = new StringBuilder();
      max = Math.max(max, Integer.parseInt(sb.append(N * i).reverse().toString()));
    }
    System.out.println(max);
  }
}