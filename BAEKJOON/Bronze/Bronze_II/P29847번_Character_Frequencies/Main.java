package BAEKJOON.Bronze.Bronze_II.P29847번_Character_Frequencies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] freq = new int[256];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (c != ' ') {
                    freq[c]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                sb.append((char) i).append(" ").append(freq[i]).append('\n');
            }
        }
        System.out.println(sb.toString().trim());
    }
}