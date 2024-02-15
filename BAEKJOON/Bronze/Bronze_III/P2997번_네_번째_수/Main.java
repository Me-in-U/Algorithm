package BAEKJOON.Bronze.Bronze_III.P2997번_네_번째_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int diff1 = numbers[1] - numbers[0];
        int diff2 = numbers[2] - numbers[1];
        int result;
        if (diff1 == diff2)
            result = numbers[2] + diff1;
        else if (diff1 < diff2)
            result = numbers[1] + diff1;
        else
            result = numbers[0] + diff2;
        System.out.println(result);
    }
}