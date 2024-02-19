package BAEKJOON.Bronze.Bronze_II.P17608번_막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int maxHeight = Integer.parseInt(br.readLine());
        int count = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (maxHeight < arr[i]) {
                maxHeight = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}