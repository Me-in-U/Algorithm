package BAEKJOON.Bronze.Bronze_IV.P33810번_SciComLove_2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = "SciComLove";
        String input = br.readLine();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (input.charAt(i) != data.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
