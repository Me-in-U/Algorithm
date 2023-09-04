package P27890번_특별한_작은_분수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int x0 = Integer.parseInt(input[0]);
    int N = Integer.parseInt(input[1]);
    while (N-- > 0) {
      x0 = (x0 % 2 == 0 ? ((x0 / 2) ^ 6) : ((2 * x0) ^ 6));
    }
    System.out.println(x0);
  }
}