package BAEKJOON.Bronze.Bronze_I.P3278번_영화_평가;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NLH = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double svg = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().skip(NLH[1])
                .limit(NLH[0] - NLH[1] - NLH[2])
                .average().orElse(0);
        System.out.println(svg);
    }
}