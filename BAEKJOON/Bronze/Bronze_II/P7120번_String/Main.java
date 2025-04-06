package BAEKJOON.Bronze.Bronze_II.P7120번_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char before = ' ';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (before != current) {
                before = current;
                sb.append(current);
            }
        }
        System.out.print(sb.toString());
    }
}