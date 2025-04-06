package BAEKJOON.Silver.Silver_V.P11256번_사탕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] JN = br.readLine().split(" ");
            int J = Integer.parseInt(JN[0]);
            int N = Integer.parseInt(JN[1]);
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < N; j++) {
                String[] RC = br.readLine().split(" ");
                pq.add(Integer.parseInt(RC[0]) * Integer.parseInt(RC[1]));
            }
            int count = 0;
            while (J > 0) {
                J -= pq.poll();
                count++;
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb.toString());
    }
}