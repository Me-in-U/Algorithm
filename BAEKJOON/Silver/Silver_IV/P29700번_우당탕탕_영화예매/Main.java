package BAEKJOON.Silver.Silver_IV.P29700번_우당탕탕_영화예매;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 0; i < N; i++) {
            Boolean[] line = br.readLine().chars().mapToObj(c -> c == '1').toArray(Boolean[]::new);
            for (int j = 0; j < M - K + 1; j++) {
                boolean avail = true;
                for (int p = j; p < j + K; p++) {
                    if (line[p]) {
                        j = p;
                        avail = false;
                        break;
                    }
                }
                if (avail) {
                    count++;
                    // System.out.println("line : " + (i + 1));
                    // System.out.println("seat from : " + (j + 1));
                }
            }
        }
        System.out.println(count);
    }
}