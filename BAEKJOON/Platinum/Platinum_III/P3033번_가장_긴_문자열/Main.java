package Platinum_III.P3033번_가장_긴_문자열;

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
    T = new long[3][(int) (length + 1)];
    for (int j = 0; j < 3; j++) {
      T[j][0] = 1;
      for (int i = 1; i <= length; i++) {
        T[j][i] = (T[j][i - 1] * P[j]) % MOD;
      }
    }
    System.out.println(binarySearch(length, str));
  }

  static long binarySearch(long length, String str) {
    long low = 0;
    long high = length;
    while (low + 1 < high) {
      long mid = (low + high) >>> 1;
      if (check(mid, length, str)) {
        low = mid;
      } else {
        high = mid;
      }
    }
    return low;
  }

  static boolean check(long mid, long length, String str) {
    H[0] = H[1] = H[2] = 0;
    for (int k = 0; k < 3; k++) {
      for (int i = 0; i < mid; i++) {
        H[k] = (H[k] + (str.charAt(i) - 'a') * T[k][(int) (mid - 1 - i)]) % MOD;
      }
    }
    // !Set 초기화
    Set<Long>[] set = new HashSet[333];
    for (int i = 0; i < set.length; i++) {
      set[i] = new HashSet<>();
    }
    set[(int) (H[0] % 333)].add(H[2]);
    for (int i = (int) mid; i < length; i++) {
      for (int j = 0; j < 3; j++) {
        H[j] = (H[j] - (str.charAt(i - (int) mid) - 'a') * T[j][(int) (mid - 1)] % MOD + MOD) % MOD;
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