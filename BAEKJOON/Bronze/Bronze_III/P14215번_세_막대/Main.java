package P14215번_세_막대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int maxN = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        System.out.println((sum > 2 * maxN) ? sum : 2 * (sum - maxN) - 1);
    }
}