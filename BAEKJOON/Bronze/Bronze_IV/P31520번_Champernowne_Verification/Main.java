package BAEKJOON.Bronze.Bronze_IV.P31520번_Champernowne_Verification;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solve(br.readLine()));
    }

    public static String solve(String n) {
        String comp = "1";
        for (int i = 0; i < n.length() - comp.length() + 1;) {
            if (n.substring(i, i + comp.length()).equals(comp)) {
                if (i + comp.length() == n.length()) {
                    return comp;
                }
            } else {
                return "-1";
            }
            i += comp.length();
            comp = String.valueOf(Integer.parseInt(comp) + 1);
        }
        return "-1";
    }
}