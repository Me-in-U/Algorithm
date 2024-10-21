package BAEKJOON.Silver.Silver_IV.P1862번_미터계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int meter = Integer.parseInt(input);
        int length = input.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            int digit = meter % 10;
            meter = meter / 10;
            if (digit > 4) {
                result += (digit - 1) * Math.pow(9, i);
            } else {
                result += digit * Math.pow(9, i);
            }
        }
        System.out.println(result);
    }
}