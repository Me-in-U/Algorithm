package BAEKJOON.Bronze.Bronze_III.P15953번_상금헌터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int result = 0;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a != 0) {
                if (a <= 1)
                    result += 500;
                else if (a <= 3)
                    result += 300;
                else if (a <= 6)
                    result += 200;
                else if (a <= 10)
                    result += 50;
                else if (a <= 15)
                    result += 30;
                else if (a <= 21)
                    result += 10;
            }
            if (b != 0) {
                if (b <= 1)
                    result += 512;
                else if (b <= 3)
                    result += 256;
                else if (b <= 7)
                    result += 128;
                else if (b <= 15)
                    result += 64;
                else if (b <= 31)
                    result += 32;
            }
            sb.append(result * 10000).append('\n');
        }
        System.out.print(sb.toString());
    }
}