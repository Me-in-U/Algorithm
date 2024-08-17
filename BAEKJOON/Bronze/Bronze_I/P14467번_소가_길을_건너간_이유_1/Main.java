package BAEKJOON.Bronze.Bronze_I.P14467번_소가_길을_건너간_이유_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        int result = 0;
        int[] cow = new int[11];
        Arrays.fill(cow, -1);
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cowNum = Integer.parseInt(st.nextToken());
            int cowLo = Integer.parseInt(st.nextToken());
            if (cow[cowNum] != cowLo && cow[cowNum] != -1) {
                result++;
            }
            cow[cowNum] = cowLo;
        }
        System.out.println(result);
    }
}