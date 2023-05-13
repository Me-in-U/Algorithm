package P3033번_가장_긴_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  static long MOD = 1000000009;
  static long[] P;
  static long[] H;
  static long[][] T;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long length = Long.parseLong(br.readLine());
    String str = br.readLine();
    P = new long[] { 167, 277, 401 };
    H = new long[3];
    T = new long[3][200001];
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i <= 200000; i++) {
        T[j][i] = i == 0 ? 1 : T[j][i - 1] * P[j] % MOD;
      }
    }
    System.out.println(binarySearch(length, str));
  }

  static long binarySearch(long length, String str) {
    long low = 0;
    long high = length;
    while (low + 1 < high) {
      long mid = (low + high) >> 1;
      if (check(mid, length, str)) {
        low = mid;
      } else {
        high = mid;
      }
    }
    return low;
  }

  // check if there is a substring of length k that appears at least twice
  static boolean check(long k, long length, String str) {
    H[0] = H[1] = H[2] = 0;
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < k; i++) {
        H[j] = (H[j] + (str.charAt(i) - 'a') * T[j][(int) (k - 1 - i)]) % MOD;
      }
    }
    Set<Long>[] set = new HashSet[333];
    for (int i = 0; i < set.length; i++) {
      set[i] = new HashSet<>();
    }
    set[(int) (H[0] % 333)].add(H[2]);
    for (int i = (int) k; i < length; i++) {
      for (int j = 0; j < 3; j++) {
        H[j] = (H[j] - (str.charAt(i - (int) k) - 'a') * T[j][(int) (k - 1)] % MOD + MOD) % MOD;
        H[j] = H[j] * P[j] % MOD;
        H[j] = (H[j] + (str.charAt(i) - 'a')) % MOD;
      }
      if (set[(int) (H[0] % 333)].contains(H[2])) {
        return true;
      } else {
        set[(int) (H[0] % 333)].add(H[2]);
      }
    }
    return false;
  }

}