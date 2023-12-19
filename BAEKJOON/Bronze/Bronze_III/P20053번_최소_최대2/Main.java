package BAEKJOON.Bronze.Bronze_III.P20053번_최소_최대2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            br.readLine();
            IntSummaryStatistics stats = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .summaryStatistics();
            sb.append(stats.getMin()).append(' ').append(stats.getMax()).append('\n');
        }
        System.out.print(sb.toString());
    }
}