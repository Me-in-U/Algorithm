package BAEKJOON.Bronze.Bronze_II.P1964번_오각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 5;
        for (int i = 2, add = 7; i <= N; i++, add = (add + 3) % 45678)
            result = (result + add) % 45678;
        System.out.println(result);
    }
}