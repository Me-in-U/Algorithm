package BAEKJOON.Bronze.Bronze_III.P2875번_대회_or_인턴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int team = 0;
        while (N >= 2 && M >= 1 && M + N >= 3 + K) {
            N -= 2;
            M--;
            team++;
        }
        System.out.println(team);
    }
}