package BAEKJOON.Bronze.Bronze_IV.P30794번_가희와_클럽_오디션_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lv = Integer.parseInt(st.nextToken()) * 100;
        String judge = st.nextToken();
        int score = 0;
        if (judge.charAt(0) == 'm')
            score = 0;
        else if (judge.charAt(0) == 'b')
            score = lv << 1;
        else if (judge.charAt(0) == 'c')
            score = lv << 2;
        else if (judge.charAt(0) == 'g')
            score = lv * 6;
        else
            score = lv * 10;
        System.out.println(score);
    }
}
