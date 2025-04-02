package P11531번_ACM_대회_채점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int[] scores = new int[26];
        boolean[] solved = new boolean[26];
        while ((line = br.readLine()).charAt(0) != '-') {
            String[] parts = line.split(" ");
            int m = Integer.parseInt(parts[0]);
            int name = parts[1].charAt(0) - 'A';
            String result = parts[2];
            if (result.charAt(0) == 'r') {
                solved[name] = true;
                scores[name] += m;
            } else {
                scores[name] += 20;
            }
        }
        int totalScore = 0;
        int solvedCount = 0;
        for (int i = 0; i < 26; i++) {
            if (solved[i]) {
                solvedCount++;
                totalScore += scores[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(solvedCount).append(" ").append(totalScore);
        System.out.print(sb.toString());
    }
}