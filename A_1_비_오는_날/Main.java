package A_1_비_오는_날;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int count = 0;
            while (N > 0) {
                if (M == 1 && K == 1) {
                    if (N == 1) {
                        count = 1;
                    } else {
                        count = -1;
                    }
                    break;
                } else {
                    N -= (M * K);
                    count++;
                    if (N <= 0) {
                        break;
                    } else {
                        N++;
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb.toString());
    }
}