package BAEKJOON.Bronze.Bronze_II.P5586번_JOI와_IOI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int JOI = 0;
        int IOI = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i + 1) == 'O' && input.charAt(i + 2) == 'I') {
                if (input.charAt(i) == 'I') {
                    IOI++;
                    i++;
                } else if (input.charAt(i) == 'J') {
                    JOI++;
                    i++;
                }
            }
        }
        System.out.println(JOI);
        System.out.println(IOI);
    }
}