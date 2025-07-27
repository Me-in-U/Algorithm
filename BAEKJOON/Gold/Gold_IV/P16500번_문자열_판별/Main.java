package BAEKJOON.Gold.Gold_IV.P16500번_문자열_판별;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        String S = br.readLine();
        int N = Integer.parseInt(br.readLine());
        List<String> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(br.readLine());
        }
        int S_length = S.length();
        boolean[] dp = new boolean[S_length + 1];
        dp[0] = true;

        // DP
        for (int i = 0; i < S_length; i++) {
            // 현재 위치 i에서 시작하는 문자열을 만들 수 있는 경우만 진행
            if (!dp[i]) {
                continue;
            }
            // 현재 위치 i에서 시작하는 문자열을 목록 A중 단어로 만들 수 있는지 확인
            for (String word : A) {
                int wordLength = word.length();
                if (i + wordLength <= S_length && S.substring(i, i + wordLength).equals(word)) {
                    dp[i + wordLength] = true;
                }
            }
        }

        // 출력
        System.out.print(dp[S_length] ? "1" : "0");
    }
}
