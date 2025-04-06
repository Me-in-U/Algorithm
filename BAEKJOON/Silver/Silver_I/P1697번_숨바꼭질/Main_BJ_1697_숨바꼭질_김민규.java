package BAEKJOON.Silver.Silver_I.P1697번_숨바꼭질;

/**
 * <h1>BAEKJOON 1697번 숨바꼭질</h1>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-07
 *        <p>
 *        JAVA8 : 메모리 13,764 KB, 시간 96ms <br>
 *        JAVA11 : 메모리 16,048 KB, 시간 132ms
 *        </p>
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main_BJ_1697_숨바꼭질_김민규 {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int K = readInt();
        int time = 0;
        boolean[] visited = new boolean[100001];
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(N);
        visited[N] = true;
        while (!queue.isEmpty() && !visited[K]) {
            int size = queue.size();
            while (size-- > 0) {
                int now = queue.poll();
                int next1 = now - 1;
                int next2 = now + 1;
                int next3 = now << 1;
                if (0 <= next1 && !visited[next1]) {
                    queue.add(next1);
                    visited[next1] = true;
                }
                if (next2 <= 100_000 && !visited[next2]) {
                    queue.add(next2);
                    visited[next2] = true;
                }
                if (next3 != 0 && next3 <= 100_000 && !visited[next3]) {
                    queue.add(next3);
                    visited[next3] = true;
                }
            }
            time++;
        }
        System.out.print(time);
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