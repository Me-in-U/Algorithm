package BAEKJOON.Bronze.Bronze_IV.P24084번_Next_Character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        br.readLine();
        String line = br.readLine();
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == 'J') {
                sb.append(line.charAt(i - 1)).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}