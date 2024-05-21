package BAEKJOON.Silver.Silver_I.P30469번_호반우가_학교에_자각한_이유_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int B_L = B / 10;
        if (!(B_L == 1 || B_L == 3 || B_L == 7 || B_L == 9)) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append(A % 10 == 9 ? 7 : 1);
        for (int i = 0; i < N - 5; i++)
            sb.append(1);
        sb.append(B);
        System.out.print(sb.toString());
    }
}