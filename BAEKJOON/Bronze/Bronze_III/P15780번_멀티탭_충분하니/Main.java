package BAEKJOON.Bronze.Bronze_III.P15780번_멀티탭_충분하니;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int count = 0;
        String[] A = br.readLine().split(" ");
        for (int i = 0; i < K; i++) {
            int holeCount = Integer.parseInt(A[i]);
            count += holeCount;
            if (holeCount % 2 == 1)
                count += 1;
        }
        System.out.println(count >= N ? "YES" : "NO");
    }
}