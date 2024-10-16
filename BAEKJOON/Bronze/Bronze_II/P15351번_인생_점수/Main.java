package P15351번_인생_점수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String name = br.readLine();
            int score = 0;
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if ('A' <= c && c <= 'Z') {
                    score += name.charAt(i) - 'A' + 1;
                }
            }
            sb.append(score == 100 ? "PERFECT LIFE" : score).append('\n');
        }
        System.out.print(sb.toString());
    }
}