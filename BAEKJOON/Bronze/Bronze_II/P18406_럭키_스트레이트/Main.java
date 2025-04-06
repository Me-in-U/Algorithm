package BAEKJOON.Bronze.Bronze_II.P18406_럭키_스트레이트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int left = 0;
        int right = 0;
        for (int i = 0; i < N.length() / 2; i++)
            left += N.charAt(i) - '0';
        for (int i = N.length() / 2; i < N.length(); i++)
            right += N.charAt(i) - '0';
        System.out.println(left == right ? "LUCKY" : "READY");
    }
}