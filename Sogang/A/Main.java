package Sogang.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int fun = 0;
        int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int previous_L = Integer.parseInt(st.nextToken());
        int previous_R = Integer.parseInt(st.nextToken());
        if (previous_L == previous_R) {
            fun = 1;
        }
        for (int i = 0; i < T - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            if (L != 0 && R != 0 && (L == previous_L || R == previous_R))
                fun++;
            if (L != 0 && R != 0 && L == R)
                fun++;
            previous_L = L;
            previous_R = R;
        }
        System.out.println(fun);
    }
}