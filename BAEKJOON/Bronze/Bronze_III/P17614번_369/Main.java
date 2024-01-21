package BAEKJOON.Bronze.Bronze_III.P17614번_369;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i <= N; i++) {
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}