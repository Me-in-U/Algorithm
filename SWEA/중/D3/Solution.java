package SWEA.중.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    protected static int[][] arr;
    protected static int N;
    protected static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            sb.append('#').append(i).append(' ');
            String[] input = br.readLine().split(" ");
            N = Integer.parseInt(input[0]);
            M = Integer.parseInt(input[1]);
            arr = new int[N][N];
            for (int n1 = 0; n1 < N; n1++) {
                input = br.readLine().split(" ");
                for (int n2 = 0; n2 < N; n2++) {
                    arr[n1][n2] = Integer.parseInt(input[n2]);
                }
            }
            sb.append(Math.max(_plusMax(), _xMax())).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static int _plusMax() {
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tempSum = arr[i][j];
                for (int k = 1; k < M; k++) {
                    if (i - k >= 0)
                        tempSum += arr[i - k][j];
                    if (i + k < N)
                        tempSum += arr[i + k][j];
                    if (j - k >= 0)
                        tempSum += arr[i][j - k];
                    if (j + k < N)
                        tempSum += arr[i][j + k];
                }
                maxSum = Math.max(maxSum, tempSum);
            }
        }
        return maxSum;
    }

    public static int _xMax() {
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tempSum = arr[i][j];
                for (int k = 1; k < M; k++) {
                    if (i - k >= 0 && j - k >= 0)
                        tempSum += arr[i - k][j - k];
                    if (i - k >= 0 && j + k < N)
                        tempSum += arr[i - k][j + k];
                    if (i + k < N && j - k >= 0)
                        tempSum += arr[i + k][j - k];
                    if (i + k < N && j + k < N)
                        tempSum += arr[i + k][j + k];
                }
                maxSum = Math.max(maxSum, tempSum);
            }
        }
        return maxSum;
    }
}