package Gold_II.P11444번_피보나치수_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static final long MOD = 1000000007L;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    System.out.println(fibonacci(n));
  }

  public static long fibonacci(long n) {
    if (n <= 1)
      return n;

    long[][] result = { // 단위 행렬
        { 1, 0 },
        { 0, 1 }
    };
    long[][] fiboM = { // 피보나치 행렬
        { 1, 1 },
        { 1, 0 }
    };

    while (n > 0) {
      if (n % 2 == 1) { // 행렬 곱
        result = multiplyMatrix(result, fiboM);
      }
      n /= 2;
      fiboM = multiplyMatrix(fiboM, fiboM);
    }
    return result[1][0];
  }

  // 행렬 곱
  public static long[][] multiplyMatrix(long[][] a, long[][] b) {
    long[][] result = new long[2][2];
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        result[i][j] = 0;
        for (int k = 0; k < 2; k++) {
          result[i][j] = (result[i][j] + (a[i][k] * b[k][j])) % MOD;
        }
      }
    }
    return result;
  }
}
