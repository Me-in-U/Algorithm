package BAEKJOON.Bronze.Bronze_II.P11117번_Letter_Cookies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] totalCount = new int[26];
            String word = br.readLine();
            for (int i = 0; i < word.length(); i++) {
                totalCount[word.charAt(i) - 'A']++;
            }
            int W = Integer.parseInt(br.readLine());
            while (W-- > 0) {
                int[] tempCount = new int[26];
                word = br.readLine();
                for (int i = 0; i < word.length(); i++) {
                    tempCount[word.charAt(i) - 'A']++;
                }
                boolean flag = true;
                for (int i = 0; i < 26; i++) {
                    if (totalCount[i] < tempCount[i]) {
                        flag = false;
                        break;
                    }
                }
                sb.append(flag ? "YES" : "NO").append("\n");
            }
        }
        System.out.print(sb.toString().trim());
    }
}