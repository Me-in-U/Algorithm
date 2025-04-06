package BAEKJOON.Gold.Gold_II.P12015번_가장_긴_증가하는_부분_수열_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] LIS = new int[N];
        LIS[0] = A[0];
        int count = 1;
        for (int i = 1; i < N; i++) {
            int key = A[i];
            if (LIS[count - 1] < key) {
                LIS[count] = key;
                count++;
            } else {
                int low = 0;
                int high = count - 1;
                while (low <= high) {
                    int mid = (low + high) >>> 1;
                    if (LIS[mid] >= key) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                LIS[low] = key;
            }
        }
        System.out.println(count);
    }
}

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// int N = Integer.parseInt(br.readLine());
// int[] A = Arrays.stream(br.readLine().split("
// ")).mapToInt(Integer::parseInt).toArray();
// int[] LIS = new int[N];
// LIS[0] = A[0];
// int count = 1;
// for (int i = 1; i < N; i++) {
// int key = A[i];
// if (LIS[count - 1] < key) {
// LIS[count - 1] = key;
// count++;
// } else {
// int low = 0;
// int high = count;
// while (low < high) {
// int mid = (low + high) >>> 1;
// if (LIS[mid] >= key) {
// high = mid;
// } else {
// low = mid + 1;
// }
// }
// LIS[low] = key;
// }
// }
// System.out.println(count);
// }
// }