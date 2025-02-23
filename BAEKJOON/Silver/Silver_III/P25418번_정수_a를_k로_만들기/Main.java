package P25418번_정수_a를_k로_만들기;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int k = readInt();
        int result = bfs(a, k);
        System.out.print(result);
    }

    private static int bfs(int a, int k) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] { a, 0 });

        boolean[] visited = new boolean[k + 1];
        visited[a] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int count = current[1];

            if (value == k) {
                return count;
            }

            int op1 = value + 1;
            if (op1 <= k && !visited[op1]) {
                queue.add(new int[] { op1, count + 1 });
                visited[op1] = true;
            }

            int op2 = value << 1;
            if (op2 <= k && !visited[op2]) {
                queue.add(new int[] { op2, count + 1 });
                visited[op2] = true;
            }
        }
        return -1;
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}