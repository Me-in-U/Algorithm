package P5176번_대회_자리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        while (K-- > 0) {
            int cannot = 0;
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            boolean[] taken = new boolean[M];
            while (P-- > 0) {
                int wantedSeat = Integer.parseInt(br.readLine()) - 1;
                if (taken[wantedSeat]) {
                    cannot++;
                } else {
                    taken[wantedSeat] = true;
                }
            }
            sb.append(cannot).append('\n');
        }
        System.out.print(sb.toString());
    }
}