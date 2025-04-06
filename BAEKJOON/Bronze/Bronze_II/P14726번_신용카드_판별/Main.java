package BAEKJOON.Bronze.Bronze_II.P14726번_신용카드_판별;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String number = br.readLine();
            int sum = 0;
            boolean isDouble = false;
            for (int i = number.length() - 1; i >= 0; i--) {
                int digit = number.charAt(i) - '0';
                if (isDouble) {
                    digit *= 2;
                    if (digit >= 10) {
                        digit = (digit / 10) + (digit % 10);
                    }
                }
                sum += digit;
                isDouble = !isDouble;
            }
            sb.append(sum % 10 == 0 ? 'T' : 'F').append('\n');
        }
        System.out.print(sb.toString());
    }
}