package P5928번_Contest_Timing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int D = Integer.parseInt(input[0]);
    int H = Integer.parseInt(input[1]);
    int M = Integer.parseInt(input[2]);
    int time1 = 11 * 60 * 24 + 11 * 60 + 11;
    int time2 = D * 60 * 24 + H * 60 + M;
    int result = time2 - time1;
    System.out.println(result < 0 ? -1 : result);
  }
}