package BAEKJOON.Silver.Silver_IV.P1940번_주몽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String data = br.readLine();
        if (M == 1 || M >= 200000) {
            System.out.println(0);
            return;
        }
        int count = 0;
        int[] numbers = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int point1 = 0;
        int point2 = numbers.length - 1;
        while (point1 < point2) {
            if (M <= numbers[point2]) {
                point2--;
                continue;
            }
            int sum = numbers[point1] + numbers[point2];
            if (sum == M) {
                count++;
                point1++;
                point2--;
            } else if (sum < M) {
                point1++;
            } else {
                point2--;
            }
        }
        System.out.println(count);
    }
}