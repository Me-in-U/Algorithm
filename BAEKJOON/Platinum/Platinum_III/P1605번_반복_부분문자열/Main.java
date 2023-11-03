package Platinum_III.P1605번_반복_부분문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    private static final long BASE = 167;
    private static final long MOD = 1_000_000_007;
    private static HashSet<Long> hashes = new HashSet<>();
    private static long[] pow;

    public static void main(String[] args) throws IOException {
        // !input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        // !solve
        pow = new long[L + 1];
        pow[0] = 1;
        for (int i = 1; i <= L; i++) {
            pow[i] = (pow[i - 1] * BASE) % MOD;
        }
        int low = 0;
        int high = L;
        while (low + 1 < high) {
            int mid = (low + high) >>> 1;
            if (search(mid, L, str)) {
                low = mid;
            } else {
                high = mid;
            }
        }
        System.out.println(low);
    }

    private static boolean search(int mid, int L, String str) {
        long h = 0;
        for (int i = 0; i < mid; i++) {
            h = (h + (str.charAt(i) - 'a') * pow[mid - 1 - i]) % MOD;
        }
        hashes.clear();
        hashes.add(h);
        for (int i = mid; i < L; i++) {
            // 이전 문자 제거
            h = (h - (pow[mid - 1] * (str.charAt(i - mid) - 'a')) % MOD) % MOD;
            // 한칸 이동
            h = (h * BASE) % MOD;
            // 새로운 문자 추가
            h = (h + (str.charAt(i) - 'a')) % MOD;
            if (hashes.contains(h)) {
                return true;
            } else {
                hashes.add(h);
            }
        }
        return false;
    }
}
