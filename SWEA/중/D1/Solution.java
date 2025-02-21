package SWEA.중.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int max = Integer.MIN_VALUE;
            if (N <= M) {
                max = getMaxSum(A, B);
            } else {
                max = getMaxSum(B, A);
            }
            sb.append('#').append(t).append(' ').append(max).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static int getMaxSum(int[] shorter, int[] longer) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= longer.length - shorter.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < shorter.length; j++) {
                tempSum += shorter[j] * longer[i + j];
            }
            maxSum = Math.max(maxSum, tempSum);
        }
        return maxSum;
    }
}