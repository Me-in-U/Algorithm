package BAEKJOON.Silver.Silver_I.P14888번_연산자_끼워넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    protected static int max = Integer.MIN_VALUE;
    protected static int min = Integer.MAX_VALUE;
    protected static int n;
    protected static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] operators = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dfs(1, numbers[0], operators[0], operators[1], operators[2], operators[3]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int depth, int value, int add, int sub, int mul, int div) {
        if (depth == n) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }
        if (add > 0)
            dfs(depth + 1, value + numbers[depth], add - 1, sub, mul, div);
        if (sub > 0)
            dfs(depth + 1, value - numbers[depth], add, sub - 1, mul, div);
        if (mul > 0)
            dfs(depth + 1, value * numbers[depth], add, sub, mul - 1, div);
        if (div > 0)
            dfs(depth + 1, value / numbers[depth], add, sub, mul, div - 1);
    }
}