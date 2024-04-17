package P24313번_알고리즘_수업_점근적_표기_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int n = 1;
        boolean result = true;
        while (n <= n0) {
            if (a1 * n0 + a0 > c * n0) {
                result = false;
                break;
            }
            n++;
        }
        System.out.print(result ? 1 : 0);
    }
}