package BAEKJOON.Bronze.Bronze_III.P33845_PNUPC에_한_도_빠지지_않고_출연한_산지니가_새삼_대단하다고_느껴지네;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sanjineeId = br.readLine();
        String t = br.readLine();

        boolean[] forbidden = new boolean[26];
        for (char c : sanjineeId.toCharArray()) {
            forbidden[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (!forbidden[c - 'a']) {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
