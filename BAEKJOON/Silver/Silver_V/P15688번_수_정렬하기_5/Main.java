package BAEKJOON.Silver.Silver_V.P15688번_수_정렬하기_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++)
            numbers[i] = Integer.parseInt(br.readLine());
        Arrays.sort(numbers);
        for (int i = 0; i < N; i++)
            sb.append(numbers[i]).append("\n");
        System.out.println(sb);
    }
}