package BAEKJOON.Bronze.Bronze_II.P30700번_KOREA_문자열_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int sum = 0;
        int length = 0;
        String korea = "KOREA";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == korea.charAt(length)) {
                length++;
                if (length == 5) {
                    sum += 5;
                    length = 0;
                }
            }
        }
        sum += length;
        System.out.println(sum);
    }
}