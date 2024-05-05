package BAEKJOON.Bronze.Bronze_IV.P29683번_Рождественская_лотерея;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int ai = Integer.parseInt(st.nextToken());
            count += ai / A;
        }
        System.out.println(count);
    }
}