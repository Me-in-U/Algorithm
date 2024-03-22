package Platinum_III.P3033번_가장_긴_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int MOD = 100_003;
    static int BASE = 2;
    public static String str;
    static int[] power;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        str = br.readLine();
        power = new int[length + 1];
        power[0] = 1;
        for (int i = 1; i < length; i++) {
            power[i] = power[i - 1] * 2 % MOD;
        }

        int left = 1;
        int right = length;
        int maxLength = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(mid, str)) {
                maxLength = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(maxLength);
    }

    private static boolean check(int length, String str) {
        List<Integer>[] table = new ArrayList[MOD];
        for (int i = 0; i < MOD; i++)
            table[i] = new ArrayList<>();

        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash = (hash * BASE + str.charAt(i)) % MOD;
        }
        table[hash].add(0);

        for (int i = 1; i <= str.length() - length; i++) {
            hash = (hash + MOD - (str.charAt(i - 1) * power[length - 1] % MOD)) % MOD; // 첫 문자 빼기, 음수 방지 + MOD
            hash = ((hash * BASE) + str.charAt(i + length - 1)) % MOD; // 마지막 문자 더하기, hash에 BASE를 곱해서 오른쪽으로 이동

            boolean isDuplicate = false;
            for (int idx : table[hash]) {
                if (compare(i, idx, length)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate)
                return true;
            table[hash].add(i);
        }
        return false;
    }

    private static boolean compare(int start1, int start2, int length) {
        for (int i = 0; i < length; i++) {
            if (str.charAt(start1 + i) != str.charAt(start2 + i)) {
                return false;
            }
        }
        return true;
    }
}
