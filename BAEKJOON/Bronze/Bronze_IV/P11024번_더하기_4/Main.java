package BAEKJOON.Bronze.Bronze_IV.P11024번_더하기_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            sb.append(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum()).append("\n");
        }
        System.out.print(sb.toString());
    }
}