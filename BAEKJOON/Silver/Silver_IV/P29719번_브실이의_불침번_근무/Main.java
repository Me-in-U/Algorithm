package P29719번_브실이의_불침번_근무;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static final int MOD = 1000000007;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    long result = (Pow(M, N) - Pow(M - 1, N) + MOD) % MOD;

    System.out.println(result);
  }

  static long Pow(int base, int exp) {
    if (exp == 0) {
      return 1;
    }
    long result = 1;
    long baseValue = base;

    while (exp > 0) {
      if (exp % 2 == 1) {
        result = (result * baseValue) % MOD;
      }
      baseValue = (baseValue * baseValue) % MOD;
      exp /= 2;
    }

    return result;
  }
}
