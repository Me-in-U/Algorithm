package BAEKJOON.Bronze.Bronze_IV.P31962번_등교;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        boolean possible = false;
        int lastTime = 0;
        while (N-- > 0) {
            input = br.readLine().split(" ");
            int S = Integer.parseInt(input[0]);
            int T = Integer.parseInt(input[1]);
            if (S + T <= X) {
                possible = true;
                lastTime = Math.max(lastTime, S);
            }
        }
        System.out.println(possible ? lastTime : -1);
    }
}
