package BAEKJOON.Bronze.Bronze_V.P34362번_Above;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double N = Double.parseDouble(br.readLine());
        double result = N - 0.3;
        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.print(sb);
    }
}
