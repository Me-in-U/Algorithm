package P10830번_행렬_제곱;

import java.io.IOException;

public class Main {
    public static int N;

    public static void main(String[] args) throws IOException {
        // 입력
        N = readInt();
        int c;
        long B = System.in.read() % 15;
        while ((c = System.in.read()) > 47)
            B = (B * 10) + (c & 15);
        System.in.read();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                arr[i][j] = readInt();

        // 풀이
        int[][] result = power(arr, B);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    private static int[][] power(int[][] arr, long B) {
        int MOD = 1000;
        if (B == 1) {
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    arr[i][j] %= MOD;
            return arr;
        }
        int[][] half = power(arr, B / 2);
        int[][] result = multiplyMatrix(half, half);
        if (B % 2 == 1)
            result = multiplyMatrix(result, arr);
        return result;
    }

    private static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    result[i][j] = (result[i][j] + (a[i][k] * b[k][j])) % 1000;
                }
            }
        }
        return result;
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
