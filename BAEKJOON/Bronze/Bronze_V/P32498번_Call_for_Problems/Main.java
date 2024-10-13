package BAEKJOON.Bronze.Bronze_V.P32498번_Call_for_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            if ((Integer.parseInt(br.readLine()) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}