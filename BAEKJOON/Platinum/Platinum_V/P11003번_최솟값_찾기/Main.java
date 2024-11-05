package P11003번_최솟값_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        Deque<int[]> q = new ArrayDeque<>();
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int Ai = Integer.parseInt(input[i]);
            while (!q.isEmpty() && q.peekLast()[0] > Ai)
                q.pollLast();
            q.offer(new int[] { Ai, i });
            if (q.peek()[1] <= (i - L))
                q.poll();
            sb.append(q.peek()[0]).append(' ');
        }
        System.out.print(sb.toString());
    }
}