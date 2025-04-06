package BAEKJOON.Gold.Gold_II.P7453번_합이_0인_네_정수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];
        int[] AB = new int[N * N];
        int[] CD = new int[N * N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            A[i] = Integer.parseInt(input[0]);
            B[i] = Integer.parseInt(input[1]);
            C[i] = Integer.parseInt(input[2]);
            D[i] = Integer.parseInt(input[3]);
        }
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                AB[index] = A[i] + B[j];
                CD[index] = C[i] + D[j];
                index++;
            }
        }

        Arrays.sort(AB);
        Arrays.sort(CD);

        long totalCount = 0;
        int left = 0;
        int right = N * N - 1;
        while (left < N * N && right >= 0) {
            if (AB[left] + CD[right] < 0) {
                left++;
            } else if (0 < AB[left] + CD[right]) {
                right--;
            } else {
                long lCount = 1;
                long rCount = 1;
                // 같은거 여러개 카운트
                while (left + 1 < (N * N) && (AB[left] == AB[left + 1])) {
                    lCount++;
                    left++;
                }
                while (0 < right && (CD[right] == CD[right - 1])) {
                    rCount++;
                    right--;
                }
                totalCount += (lCount * rCount);
                left++;
            }
        }
        System.out.println(totalCount);
    }
}