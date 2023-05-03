package P19698번_헛간_청약;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int W = Integer.parseInt(input[1]);
    int H = Integer.parseInt(input[2]);
    int L = Integer.parseInt(input[3]);
    System.out.println(Math.min(N, (W / L) * (H / L)));
  }
}