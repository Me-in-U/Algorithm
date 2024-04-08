package BAEKJOON.Bronze.Bronze_IV.P31656번_Sticky_Keys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        char before = str.charAt(0);
        sb.append(before);
        for (int i = 1; i < str.length(); i++) {
            char next = str.charAt(i);
            if (before != next) {
                before = next;
                sb.append(before);
            }
        }
        System.out.print(sb.toString());
    }
}