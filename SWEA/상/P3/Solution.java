package SWEA.상.P3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    protected static int N;
    protected static int B;
    protected static int[] H;
    protected static int minHeight;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        String[] temp;
        for (int t = 1; t <= T; t++) {
            sb.append('#').append(t).append(" ");
            temp = br.readLine().split(" ");
            N = Integer.parseInt(temp[0]);
            B = Integer.parseInt(temp[1]);
            H = new int[N];
            temp = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                H[i] = Integer.parseInt(temp[i]);
            }
            minHeight = Integer.MAX_VALUE;
            findMinHeight(0, 0);
            sb.append(minHeight - B).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static void findMinHeight(int index, int sum) {
        if (index == N) {
            if (sum >= B) {
                minHeight = Math.min(minHeight, sum);
            }
            return;
        }
        findMinHeight(index + 1, sum);
        findMinHeight(index + 1, sum + H[index]);
    }
}
