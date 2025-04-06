package BAEKJOON.Bronze.Bronze_II.P14322번_County_Leader_Small.P14322번_County_Leader_Small;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int maxCount = 0;
            String candidate = "ZZZZZZZZZZZZZZZZZZZZ";
            while (N-- > 0) {
                boolean[] alphabetLetters = new boolean[26];
                String name = br.readLine();
                for (int j = 0; j < name.length(); j++) {
                    char c = name.charAt(j);
                    if ('A' <= c && c <= 'Z') {
                        alphabetLetters[c - 'A'] = true;
                    }
                }
                int count = 0;
                for (int j = 0; j < 26; j++) {
                    if (alphabetLetters[j]) {
                        count++;
                    }
                }
                if (maxCount < count) {
                    candidate = name;
                    maxCount = count;
                } else if (maxCount == count) {
                    candidate = name.compareTo(candidate) < 0 ? name : candidate;
                }
            }
            sb.append("Case #").append(i).append(": ").append(candidate).append('\n');
        }
        System.out.print(sb.toString());
    }
}