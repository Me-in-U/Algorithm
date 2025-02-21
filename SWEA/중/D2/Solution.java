package SWEA.중.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    protected static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N][N];
            for (int j = 0; j < N; j++) {
                String[] input = br.readLine().split(" ");
                for (int k = 0; k < N; k++) {
                    arr[j][k] = Integer.parseInt(input[k]);
                }
            }
            sb.append("#").append(i).append("\n");
            for (int k = 0; k < N; k++) {
                sb.append(_90degree(N, k)).append(' ')
                        .append(_180degree(N, k)).append(' ')
                        .append(_270degree(N, k)).append('\n');
            }
        }
        System.out.print(sb);
    }

    public static String _90degree(int N, int row) {
        StringBuilder temp = new StringBuilder();
        for (int col = N - 1; col >= 0; col--) {
            temp.append(arr[col][row]);
        }
        return temp.toString();
    }

    public static String _180degree(int N, int row) {
        StringBuilder temp = new StringBuilder();
        for (int col = N - 1; col >= 0; col--) {
            temp.append(arr[N - row - 1][col]);
        }
        return temp.toString();
    }

    public static String _270degree(int N, int row) {
        StringBuilder temp = new StringBuilder();
        for (int col = 0; col < N; col++) {
            temp.append(arr[col][N - row - 1]);
        }
        return temp.toString();
    }
}