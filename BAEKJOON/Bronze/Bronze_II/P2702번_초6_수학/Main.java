package P2702번_초6_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int gcd = GCD(a, b);
            sb.append(a * b / gcd).append(' ').append(gcd).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static int GCD(int a, int b) {
        if (a % b == 0)
            return b;
        return GCD(b, a % b);
    }
}