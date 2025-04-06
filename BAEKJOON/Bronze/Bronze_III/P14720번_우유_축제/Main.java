package BAEKJOON.Bronze.Bronze_III.P14720번_우유_축제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++)
            if (Integer.parseInt(st.nextToken()) == max % 3)
                max++;
        System.out.println(max);
    }
}