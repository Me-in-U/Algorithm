package P24416번_알고리즘_수업_피보나치_수_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  private static int code1 = 0;
  private static int code2 = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    fib(N);
    fibonacci(N);
    System.out.println(code1 + " " + code2);
  }

  public static int fib(int n) {
    if (n == 1 || n == 2) {
      code1++;
      return 1;
    } else {
      return (fib(n - 1) + fib(n - 2));
    }
  }

  public static int fibonacci(int n) {
    int[] f = new int[n + 1];
    f[1] = f[2] = 1;
    for (int i = 3; i <= n; i++) {
      code2++;
      f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
  }
}