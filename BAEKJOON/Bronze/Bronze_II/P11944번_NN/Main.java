package BAEKJOON.Bronze.Bronze_II.P11944번_NN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++)
            sb.append(input[0]);
        String result = sb.toString();
        System.out.println(result.length() > M ? result.substring(0, M) : result);
    }
}