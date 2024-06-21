package BAEKJOON.Silver.Silver_III.P14469번_소가_길을_건너간_이유_3;

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
        int minTime = 0;
        int[][] cow = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            cow[i][0] = Integer.parseInt(st.nextToken());
            cow[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cow, (x, y) -> (x[0] - y[0]));
        for (int i = 0; i < N; i++) {
            minTime = (minTime < cow[i][0]) ? (cow[i][0] + cow[i][1]) : (minTime + cow[i][1]);
        }
        System.out.println(minTime);
    }
}
