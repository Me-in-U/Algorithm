package BAEKJOON.Bronze.Bronze_III.P26264번_빅데이터_정보보호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int bigDataCount = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'b')
                bigDataCount++;
        int securityCount = N - bigDataCount;

        if (bigDataCount > securityCount) {
            sb.append("bigdata?");
        } else if (bigDataCount == securityCount) {
            sb.append("bigdata? security!");
        } else {
            sb.append("security!");
        }

        System.out.println(sb.toString());
    }
}