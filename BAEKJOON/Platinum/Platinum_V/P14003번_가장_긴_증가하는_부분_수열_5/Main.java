package P14003번_가장_긴_증가하는_부분_수열_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] seq = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] LIS = new int[N + 1];
        int[] dp = new int[N];

        LIS[0] = -1_000_000_001;
        int len = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            int key = seq[i];
            if (LIS[len] < key) {
                LIS[++len] = key;
                dp[i] = len;
            } else {
                int left = 0;
                int right = len;
                while (left < right) {
                    int mid = (left + right) >>> 1;
                    if (LIS[mid] < key) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                dp[i] = idx = right;
                LIS[idx] = seq[i];
            }
        }

        sb.append(len).append('\n');
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = N - 1; i >= 0; i--) {
            if (dp[i] == len) {
                dq.push(seq[i]);
                len--;
            }
        }
        while (!dq.isEmpty()) {
            sb.append(dq.pop()).append(' ');
        }
        System.out.println(sb.toString());
    }
}