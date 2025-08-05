package BAEKJOON.Bronze.Bronze_III.P25915번_연세여_사랑한다;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = Math.abs(br.readLine().charAt(0) - 'I') + 84;
        sb.append(answer);
        System.out.println(sb.toString());
    }
}