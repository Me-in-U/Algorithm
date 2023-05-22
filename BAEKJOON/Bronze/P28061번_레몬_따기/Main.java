package P28061번_레몬_따기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int max = 0;
    String[] input = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      max = Math.max(max, Integer.parseInt(input[i]) - (N - i));
    }
    System.out.println(max);
  }
}