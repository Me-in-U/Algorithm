package Gold_I.P12850번_본대_산책2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    protected static final long MOD = 1_000_000_007;
    protected static long[][] graph = {
            { 0, 1, 0, 1, 0, 0, 0, 0 },
            { 1, 0, 1, 1, 0, 0, 0, 0 },
            { 0, 1, 0, 1, 1, 1, 0, 0 },
            { 1, 1, 1, 0, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 0, 1, 1, 0 },
            { 0, 0, 1, 1, 1, 0, 0, 1 },
            { 0, 0, 0, 0, 1, 0, 0, 1 },
            { 0, 0, 0, 0, 0, 1, 1, 0 }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(br.readLine());
        long[][] ans = doPow(D);
        System.out.println(ans[0][0]);
    }

    private static long[][] doPow(int n) {
        if (n == 1)
            return graph;
        long[][] temp = doPow(n / 2);
        temp = multiply(temp, temp);
        if (n % 2 == 1)
            temp = multiply(temp, graph);
        return temp;
    }

    private static long[][] multiply(long[][] a, long[][] b) {
        long[][] temp = new long[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                for (int k = 0; k < 8; k++)
                    temp[i][j] = (temp[i][j] + a[i][k] * b[k][j]) % MOD;
        return temp;
    }
}