package SWEA.상.P3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        String[] temp;
        for (int t = 1; t <= T; t++) {
            sb.append('#').append(t).append(" ");
            temp = br.readLine().split(" ");
            int N = Integer.parseInt(temp[0]);
            int B = Integer.parseInt(temp[1]);
            int[] H = new int[N];
            temp = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                H[i] = Integer.parseInt(temp[i]);
            }
            int minHeight = Integer.MAX_VALUE;
            int totalSubsets = 1 << N;
            for (int subset = 0; subset < totalSubsets; subset++) {
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    if ((subset & (1 << i)) != 0) {
                        sum += H[i];
                    }
                }
                if (B <= sum) {
                    minHeight = Math.min(minHeight, sum);
                }
            }
            sb.append(minHeight - B).append('\n');
        }
        System.out.print(sb.toString());
    }
}
