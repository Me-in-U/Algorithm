package BAEKJOON.Silver.Silver_IV.P30458번_팰린드롬_애너그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for (int i = 0; i < N; i++)
            count[S.charAt(i) - 'a']++;
        if (N % 2 == 1)
            count[S.charAt(N / 2) - 'a']--;
        boolean able = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                able = false;
                break;
            }
        }
        System.out.println(able ? "Yes" : "No");
    }
}