package BAEKJOON.Silver.Silver_I.P32206번_아보와_킨텍스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.readLine();
        int count = ((N + 1) * 26) - 2;
        if (N > 1) {
            count -= (N - 2);
        } else {
            count++;
        }
        System.out.println(count);
    }
}
