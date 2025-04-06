package BAEKJOON.Bronze.Bronze_II.P10202번_Longest_Subsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int max = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                boolean isX = st.nextToken().charAt(0) == 'X';
                if (isX) {
                    max = Math.max(max, ++count);
                } else {
                    count = 0;
                }
            }
            sb.append("The longest contiguous subsequence of X's is of length ").append(max).append('\n');
        }
        System.out.print(sb.toString());
    }
}