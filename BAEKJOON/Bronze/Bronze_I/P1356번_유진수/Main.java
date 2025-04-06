package BAEKJOON.Bronze.Bronze_I.P1356번_유진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        boolean uJin = false;
        if (number.length() != 1) {
            for (int i = 1; i < number.length(); i++) {
                int left = 1;
                int right = 1;
                for (int j = 0; j < i; j++) {
                    left *= number.charAt(j) - '0';
                }
                for (int j = i; j < number.length(); j++) {
                    right *= number.charAt(j) - '0';
                }
                if (left == right) {
                    uJin = true;
                    break;
                }
            }
        }
        System.out.println(uJin ? "YES" : "NO");
    }
}