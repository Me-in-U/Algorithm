package BAEKJOON.Bronze.Bronze_III.P26594번_ZOAC_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = 1;
        char first = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == first) {
                n++;
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        System.out.print(sb.toString());
    }
}
