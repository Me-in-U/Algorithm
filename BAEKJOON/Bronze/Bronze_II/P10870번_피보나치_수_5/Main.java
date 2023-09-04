package P10870번_피보나치_수_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    System.out.println(Fibo(N));
  }

  public static int Fibo(int N) {
    if (N == 0)
      return N;
    else if (N == 1)
      return 1;
    return Fibo(N - 1) + Fibo(N - 2);
  }
}