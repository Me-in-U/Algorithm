package BAEKJOON.Bronze.Bronze_III.P28454번_Gift_Expire_Date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String today = br.readLine().trim();
        int N = Integer.parseInt(br.readLine().trim());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String exp = br.readLine().trim();
            if (exp.compareTo(today) >= 0) {
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.print(sb.toString());
    }
}
