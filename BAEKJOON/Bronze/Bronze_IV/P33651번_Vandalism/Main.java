package BAEKJOON.Bronze.Bronze_IV.P33651번_Vandalism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        String target = "UAPC";
        StringBuilder missing = new StringBuilder();
        int i = 0, j = 0;
        while (i < target.length()) {
            if (j < input.length() && target.charAt(i) == input.charAt(j)) {
                j++;
            } else {
                missing.append(target.charAt(i));
            }
            i++;
        }
        System.out.println(missing.toString());
    }
}
