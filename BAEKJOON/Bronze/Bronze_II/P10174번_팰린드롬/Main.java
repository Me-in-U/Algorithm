package BAEKJOON.Bronze.Bronze_II.P10174번_팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String str = br.readLine();
            sb.append(isPalindrome(str.toLowerCase()) ? "Yes" : "No").append('\n');
        }
        System.out.print(sb.toString());
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - 1 - i);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}