package BAEKJOON.Bronze.Bronze_I.P12833번_XORXORXOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] abc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(abc[2] % 2 == 1 ? abc[0] ^ abc[1] : abc[0]);
    }
}