package BAEKJOON.Bronze.Bronze_II.P11195번_Peragrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] alphabetCount = new int[26];
        for (char c : word.toCharArray())
            alphabetCount[c - 'a']++;
        int oddCount = (int) Arrays.stream(alphabetCount).filter(i -> i % 2 != 0).count();
        System.out.println(oddCount == 0 ? "0" : oddCount - 1);
    }
}
