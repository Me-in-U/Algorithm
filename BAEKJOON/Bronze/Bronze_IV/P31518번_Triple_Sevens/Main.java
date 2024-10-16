package P31518번_Triple_Sevens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        boolean sss = true;
        for (int i = 0; i < 3; i++) {
            boolean s = false;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                if (Integer.parseInt(st.nextToken()) == 7) {
                    s = true;
                    break;
                }
            }
            if (!s) {
                sss = false;
            }
        }
        System.out.println(sss ? "777" : "0");
    }
}
