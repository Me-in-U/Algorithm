package BAEKJOON.Bronze.Bronze_II.P11319번_Count_Me_In;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String sentence = br.readLine().replace(" ", "");
            int consonants = sentence.replaceAll("[AEIOUaeiou]", "").length();
            sb.append(consonants).append(" ").append(sentence.length() - consonants).append("\n");
        }
        System.out.print(sb.toString());
    }
}