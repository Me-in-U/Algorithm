package P15650번_N과_M_2;

/**
 * BAEKJOON ONLINE JUDGE
 * 15650번 N과 M(2) SILVER III
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-21
 * JAVA8 : 메모리 11452 KB, 시간 68ms
 * JAVA11 : 메모리 14152 KB, 시간 104ms
 */

import java.io.IOException;

public class Main_15650_N과M_김민규 {
    private static int[] arr;
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        N = readInt();
        M = readInt();
        arr = new int[M];

        // 수열 탐색 시작
        // 1부터 시작해서 depth == M일 때까지 dfs
        dfs(1, 0);

        // 출력
        System.out.print(sb);
    }

    /**
     * @param num   출력할 숫자
     * @param depth 출력될 숫자의 index
     */

    private static void dfs(int num, int depth) {
        if (depth == M) {
            for (int val : arr)
                sb.append(val).append(' ');
            sb.append('\n');
            return;
        }

        for (int i = num; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
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