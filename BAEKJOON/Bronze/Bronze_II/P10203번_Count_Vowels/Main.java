package BAEKJOON.Bronze.Bronze_II.P10203번_Count_Vowels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String word = br.readLine();
            long count = word.chars()
                    .filter(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u').count();
            sb.append("The number of vowels in ").append(word).append(" is ").append(count).append(".").append('\n');
        }
        System.out.print(sb.toString());
    }
}