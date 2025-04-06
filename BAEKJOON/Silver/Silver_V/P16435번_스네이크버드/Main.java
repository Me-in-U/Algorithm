package BAEKJOON.Silver.Silver_V.P16435번_스네이크버드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NL = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        for (int i = 0; i < NL[0]; i++)
            if (NL[1] >= arr[i])
                NL[1]++;
        System.out.println(NL[1]);
    }
}