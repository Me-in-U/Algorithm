package BAEKJOON.Bronze.Bronze_IV.P32684번_장기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score_data = { 130, 70, 50, 30, 30, 20 };
        int score_chuck_e = 0;
        int score_eungyu = 15;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < score_data.length; i++) {
            score_chuck_e += Integer.parseInt(st.nextToken()) * score_data[i];
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < score_data.length; i++) {
            score_eungyu += Integer.parseInt(st.nextToken()) * score_data[i];
        }
        System.out.println(score_chuck_e > score_eungyu ? "cocjr0208" : "ekwoo");
    }
}