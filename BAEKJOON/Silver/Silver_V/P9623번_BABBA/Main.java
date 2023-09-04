package Silver_V.P9623번_BABBA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int A = 1;
    int B = 0;
    for (int i = 0; i < N; i++) {
      int BTemp = A + B;
      A = B;
      B = BTemp;
    }
    System.out.print(A + " " + B);
  }
}