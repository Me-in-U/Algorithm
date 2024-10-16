package P15792번_A_divided_by_B_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        sb.append(A / B).append('.');
        A = 10 * (A - B * (A / B));
        int T = 1000;
        while (T-- > 0) {
            sb.append(A / B);
            A = 10 * (A - B * (A / B));
        }
        System.out.println(sb.toString());
    }
}