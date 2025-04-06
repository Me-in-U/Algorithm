package BAEKJOON.Unrated.P17112번_;

// 2nd-editorial 참고
// https://github.com/ghudegy/2019/blob/master/2nd-editorial.md

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char first = s.charAt(0);

        // 1. 첫 글자가 한글이면 → UTF-8
        // 한글 범위: AC00 ~ D7A3
        if ('\uAC00' <= first && first <= '\uD7A3') {
            System.out.print("UTF-8");
            return;
        }

        // 2. 첫 글자가 태국어(Thai Unicode 0E00~0E7F)면 → IBM-Thai
        // 태국어 범위: 0E00 ~ 0E7F
        if ('\u0E00' <= first && first <= '\u0E7F') {
            System.out.print("IBM-Thai");
            return;
        }

        // 3. 첫 글자가 windows-1252 후보 (ê, ë, ì, í: U+00EA, U+00EB, U+00EC, U+00ED)이면
        // windows-1252 후보: ê (00EA), ë (00EB), ì (00EC), í (00ED)
        if (first == '\u00EA' || first == '\u00EB' || first == '\u00EC' || first == '\u00ED') {
            System.out.print("windows-1252");
            return;
        }

        // 4. 남은 경우: EUC-KR vs Shift_JIS
        // Shift_JIS인 경우엔 반드시 반각 가타카나(Unicode: FF65~FF9F)가 등장함
        // 반각 가타카나 범위: FF65 ~ FF9F
        if (s.chars().anyMatch(c -> 0xFF65 <= c && c <= 0xFF9F)) {
            System.out.print("Shift_JIS");
        } else {
            System.out.print("EUC-KR");
        }
    }
}
