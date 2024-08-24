package BAEKJOON.Silver.Silver_V.P11637번_인기_투표;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int max_vote = 0;
            int max_num = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int votes = Integer.parseInt(br.readLine());
                sum += votes;
                if (votes > max_vote) {
                    max_vote = votes;
                    max_num = i + 1;
                } else if (votes == max_vote) {
                    max_vote = votes;
                    max_num = 0;
                }
            }
            if (max_num != 0) {
                sb.append((max_vote > sum / 2) ? "majority " : "minority ").append("winner ").append(max_num);
            } else {
                sb.append("no winner");
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}