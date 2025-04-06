package BAEKJOON.Gold.Gold_IV.P12851번_숨바꼭질_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int time = 0;
        boolean[] visited = new boolean[100001];
        boolean found = false;
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = true;
        while (!queue.isEmpty() && !found) {
            time++;
            int size = queue.size();
            Set<Integer> added = new HashSet<>();
            while (size-- > 0) {
                int now = queue.poll();
                if (now == K) {
                    found = true;
                    count++;
                }
                int next1 = now - 1;
                int next2 = now + 1;
                int next3 = now << 1;
                if (0 <= next1 && !visited[next1]) {
                    queue.add(next1);
                    added.add(next1);
                }
                if (next2 <= 100_000 && !visited[next2]) {
                    queue.add(next2);
                    added.add(next2);
                }
                if (next3 <= 100_000 && next3 != 0 && !visited[next3]) {
                    queue.add(next3);
                    added.add(next3);
                }
            }
            if (found) {
                System.out.print((time - 1) + " " + count);
                return;
            }
            for (int num : added) {
                visited[num] = true;
            }
        }
    }
}