package P24091번_알고리즘_수업_퀵_정렬_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    protected static int count = 0;
    protected static int K;
    protected static int N;
    protected static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        quick_sort(0, N - 1);
        if (count < K) {
            System.out.println("-1");
        }
    }

    public static void swap(int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void quick_sort(int p, int r) {
        if (p < r) {
            int q = partition(p, r);
            quick_sort(p, q - 1);
            quick_sort(q + 1, r);
        }
    }

    public static int partition(int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                swap(++i, j);
                if (++count == K) {
                    print();
                }
            }
        }
        if (i + 1 != r) {
            swap(i + 1, r);
            if (++count == K) {
                print();
            }
        }
        return i + 1;
    }

    public static void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}