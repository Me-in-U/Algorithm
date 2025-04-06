package BAEKJOON.Bronze.Bronze_II.P7567번_그릇;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = 10;
        for (int i = 1; i < input.length(); i++)
            result += input.charAt(i - 1) == input.charAt(i) ? 5 : 10;
        System.out.println(result);
    }
}