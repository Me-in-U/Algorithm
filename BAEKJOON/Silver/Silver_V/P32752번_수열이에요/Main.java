package BAEKJOON.Silver.Silver_V.P32752번_수열이에요;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] partArr = Arrays.copyOfRange(arr, L - 1, R);
        Arrays.sort(partArr);
        System.arraycopy(partArr, 0, arr, L - 1, partArr.length);
        boolean isIncreasing = true;
        for (int i = 1; i < N; i++) {
            if (arr[i] < arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        System.out.println(isIncreasing ? 1 : 0);
    }
}
