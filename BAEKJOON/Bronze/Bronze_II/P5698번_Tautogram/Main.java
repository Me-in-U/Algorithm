package BAEKJOON.Bronze.Bronze_II.P5698번_Tautogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = br.readLine()).charAt(0) != '*') {
            String[] words = str.split(" ");
            char firstChar = words[0].toLowerCase().charAt(0);
            boolean isTautogram = true;
            for (int i = 1; i < words.length; i++) {
                if (words[i].toLowerCase().charAt(0) != firstChar) {
                    isTautogram = false;
                    break;
                }
            }
            sb.append(isTautogram ? "Y" : "N").append("\n");
        }
        System.out.print(sb);
    }
}
