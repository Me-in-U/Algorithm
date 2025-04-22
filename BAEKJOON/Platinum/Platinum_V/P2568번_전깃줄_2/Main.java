package BAEKJOON.Platinum.Platinum_V.P2568번_전깃줄_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static class Line {
        int a, b;

        Line(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        // 정렬때문에 0index부터 시작
        Line[] lines = new Line[N];
        for (int i = 0; i < N; i++)
            lines[i] = new Line(readInt(), readInt());
        Arrays.sort(lines, Comparator.comparingInt(x -> x.a));

        int[] seq = new int[N + 1];
        for (int i = 1; i <= N; i++)
            seq[i] = lines[i - 1].b;

        // 3) LIS 구하기 (1..N)
        int[] LIS = new int[N + 1];
        int[] dp = new int[N + 1]; // dp[i] = seq[i]가 속한 LIS의 길이
        LIS[0] = Integer.MIN_VALUE;
        int len = 0;
        for (int i = 1; i <= N; i++) {
            int key = seq[i];
            // 지금까지 LIS의 마지막 값보다 크면 LIS 마지막에 추가
            if (LIS[len] < key) {
                LIS[++len] = key;
                dp[i] = len;
            } else {
                // LIS[?-1] < key ≤ LIS[?]인 위치 찾기
                int pos = Arrays.binarySearch(LIS, 1, len + 1, key);
                // LIS에서 같은 값이 없는경우 음수로 리턴됨 -> 변환
                if (pos < 0)
                    pos = -(pos + 1);
                LIS[pos] = key;
                dp[i] = pos;
            }
        }

        // 역추적: dp[i]==cur인 인덱스를 보존
        boolean[] keep = new boolean[N + 1];
        int cur = len;
        for (int i = N; i >= 1; i--) {
            if (dp[i] == cur) {
                keep[i] = true;
                cur--;
            }
        }

        List<Integer> removeList = new ArrayList<>();
        for (int i = 1; i <= N; i++)
            if (!keep[i])
                removeList.add(lines[i - 1].a);
        Collections.sort(removeList);

        // 출력
        StringBuilder sb = new StringBuilder();
        sb.append(removeList.size()).append('\n');
        for (int a : removeList) {
            sb.append(a).append('\n');
        }
        System.out.print(sb);
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
