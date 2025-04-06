package BAEKJOON.Bronze.Bronze_II.P11145번_Is_it_a_Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String trimmed = br.readLine().trim();
            if (!trimmed.matches("\\d+")) {
                sb.append("invalid input");
            } else {
                sb.append(new BigInteger(trimmed));
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
