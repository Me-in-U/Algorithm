package BAEKJOON.Bronze.Bronze_IV.P32025번_체육은_수학과목_입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minLength = Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
        System.out.print((int) Math.floor((minLength / 2.0 * 100)));
    }
}