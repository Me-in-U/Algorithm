package BAEKJOON.Bronze.Bronze_IV.P32642번_당구_좀_치자_제발;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rain = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long sum = 0;
        int anger = 0;
        for (int i = 0; i < N; i++) {
            if (rain[i] == 0) {
                anger--;
            } else {
                anger++;
            }
            sum += anger;
        }
        System.out.println(sum);
    }
}