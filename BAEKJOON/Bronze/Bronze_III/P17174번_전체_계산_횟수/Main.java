package BAEKJOON.Bronze.Bronze_III.P17174번_전체_계산_횟수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int count = N;
        while (N >= M) {
            count += (N = (N / M));
        }
        System.out.println(count);
    }
}