package BAEKJOON.Bronze.Bronze_III.P13163번_닉네임에_갓_붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String[] name = br.readLine().split(" ");
            sb.append("god");
            for (int i = 1; i < name.length; i++) {
                sb.append(name[i]);
            }
            sb.append('\n');
        }
        System.out.print(sb.toString().trim());
    }
}