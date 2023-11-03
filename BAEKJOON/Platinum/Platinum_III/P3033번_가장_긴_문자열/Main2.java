package Platinum_III.P3033번_가장_긴_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  static final long MOD = 1000000009;
  static final long[] P = { 167, 277, 401 };
  static long[][] T = new long[3][100001]; // 가정: 최대 길이 100000
  static long[] H = new long[3];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long length = Long.parseLong(br.readLine());
    String str = br.readLine();
    initializeT(length);
    System.out.println(binarySearch(length, str));
  }

  static void initializeT(long length) {
    for (int j = 0; j < 3; j++) {
      T[j][0] = 1;
      for (int i = 1; i <= length; i++) {
        T[j][i] = (T[j][i - 1] * P[j]) % MOD;
      }
    }
  }

  static long binarySearch(long length, String str) {
    long low = 0, high = length;
    while (low + 1 < high) {
      long mid = (low + high) >>> 1;
      if (check(mid, str))
        low = mid;
      else
        high = mid;
    }
    return low;
  }

  static boolean check(long mid, String str) {
    Set<Long> set = new HashSet<>();
    calculateInitialHashes(mid, str);
    set.add(combineHashes());

    for (int i = (int) mid; i < str.length(); i++) {
      int removedIndex = i - (int) mid;
      updateHash(removedIndex, str.charAt(removedIndex), mid - 1, -1);
      updateHash(i, str.charAt(i), 0, 1);
      long combinedHash = combineHashes();
      if (set.contains(combinedHash))
        return true;
      set.add(combinedHash);
    }
    return false;
  }

  static void calculateInitialHashes(long mid, String str) {
    resetHashes();
    for (int i = 0; i < mid; i++) {
      updateHash(i, str.charAt(i), mid - 1 - i, 1);
    }
  }

  static void resetHashes() {
    H[0] = H[1] = H[2] = 0;
  }

  static void updateHash(int index, char c, int exp, int sign) {
    long value = (c - 'a') * T[exp] % MOD;
    for (int k = 0; k < 3; k++) {
      H[k] = (H[k] + sign * value * (sign == 1 ? 1 : P[k])) % MOD;
      if (H[k] < 0)
        H[k] += MOD;
    }
  }

  static long combineHashes() {
    return (H[0] << 32) | (H[1] << 16) | H[2];
  }
}
