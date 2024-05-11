package BAEKJOON.Bronze.Bronze_II.P1919번_애너그램_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        String A = br.readLine();
        String B = br.readLine();
        for (int i = 0; i < A.length(); i++)
            count[A.charAt(i) - 'a']++;
        for (int i = 0; i < B.length(); i++)
            count[B.charAt(i) - 'a']--;
        int result = 0;
        for (int i = 0; i < count.length; i++)
            result += Math.abs(count[i]);
        System.out.println(result);
    }
}