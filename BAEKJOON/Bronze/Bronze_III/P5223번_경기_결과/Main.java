package BAEKJOON.Bronze.Bronze_III.P5223번_경기_결과;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int[] wins = new int[2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int AScore = Integer.parseInt(st.nextToken());
            int BScore = Integer.parseInt(st.nextToken());
            if (AScore > BScore)
                wins[0]++;
            else if (AScore < BScore)
                wins[1]++;
        }
        System.out.println(wins[0] + " " + wins[1]);
    }
}