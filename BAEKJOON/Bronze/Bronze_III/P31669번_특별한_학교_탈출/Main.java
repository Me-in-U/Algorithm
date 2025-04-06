package BAEKJOON.Bronze.Bronze_III.P31669번_특별한_학교_탈출;

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
        String[] patrol = new String[N];
        for (int i = 0; i < N; i++)
            patrol[i] = br.readLine();
        boolean escaped = false;
        int result = 0;
        for (int time = 0; time < M; time++) {
            boolean unable = false;
            for (int i = 0; i < N; i++) {
                if (patrol[i].charAt(time) == 'O') {
                    unable = true;
                    break;
                }
            }
            if (!unable) {
                escaped = true;
                result = time + 1;
                break;
            }
        }
        System.out.println(escaped ? result : "ESCAPE FAILED");
    }
}