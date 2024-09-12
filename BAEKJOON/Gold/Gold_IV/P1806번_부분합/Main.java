package BAEKJOON.Gold.Gold_IV.P1806번_부분합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int[] numbers = Arrays.stream((br.readLine() + " 0").split(" ")).mapToInt(Integer::parseInt).toArray();
        int minLength = 100_001;
        int sum = 0;
        int indexA = 0;
        int indexB = 0;
        while ((indexA <= N) && (indexB <= N)) {
            if ((S <= sum) && (indexB - indexA) < minLength) {
                minLength = (indexB - indexA);
            }
            sum = (sum < S) ? (sum + numbers[indexB++]) : (sum - numbers[indexA++]);
        }
        System.out.println(minLength == 100_001 ? 0 : minLength);
    }
}