package BAEKJOON.Bronze.Bronze_I.P17288번_3개만;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder ans = new StringBuilder();
        ans.append(line.charAt(0));
        int count = 0;
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i - 1) + 1 == line.charAt(i)) {
                ans.append(line.charAt(i));
            } else {
                if (ans.length() == 3)
                    count++;
                ans = new StringBuilder();
                ans.append(line.charAt(i));
            }
        }
        if (ans.length() == 3)
            count++;
        System.out.println(count);
    }
}
