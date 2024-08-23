package BAEKJOON.Bronze.Bronze_III.P23080번_스키테일_암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String S = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i += K) {
            sb.append(S.charAt(i));
        }
        System.out.print(sb.toString());
    }
}