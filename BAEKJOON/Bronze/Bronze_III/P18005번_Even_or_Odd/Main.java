package BAEKJOON.Bronze.Bronze_III.P18005번_Even_or_Odd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        if (n % 2 == 1) {
            System.out.print(0);
        } else {
            if (n % 4 == 0) {
                System.out.print(2);
            } else {
                System.out.print(1);
            }
        }
    }
}
