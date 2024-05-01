package BAEKJOON.Bronze.Bronze_IV.P30585번_Поп_ит;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int zero = 0;
        for (int i = 0; i < h; i++) {
            String line = br.readLine();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '0') {
                    zero++;
                }
            }
        }
        System.out.println(zero < h * w - zero ? zero : h * w - zero);
    }
}
