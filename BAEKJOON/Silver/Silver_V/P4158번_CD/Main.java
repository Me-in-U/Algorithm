package P4158번_CD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            if (N == 0 && M == 0) {
                break;
            }
            int[] a1 = new int[N];
            int[] a2 = new int[M];
            for (int i = 0; i < N; i++) {
                a1[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < M; i++) {
                a2[i] = Integer.parseInt(br.readLine());
            }
            int count = 0;
            int p1 = 0;
            int p2 = 0;
            while (p1 != N && p2 != M) {
                if (a1[p1] == a2[p2]) {
                    count++;
                    p1++;
                    p2++;
                } else if (a1[p1] > a2[p2]) {
                    p2++;
                } else {
                    p1++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb.toString().trim());
    }
}
