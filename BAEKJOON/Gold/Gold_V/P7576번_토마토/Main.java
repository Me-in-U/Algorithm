package BAEKJOON.Gold.Gold_V.P7576번_토마토;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main {
    // 하, 우, 상, 좌
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { 1, 0, -1, 0 };

    static int[][] arr;
    static boolean[][] visited;

    static int M, N, days;
    static int count_zero;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    count_zero++;
                } else if (num == 1) {
                    q.offer(new int[] { i, j });
                } else {
                    visited[i][j] = true;
                }
                arr[i][j] = num;
            }
        }
        BFS(q);
        if (count_zero > 0) {
            System.out.println("-1");
        } else {
            System.out.println(days);
        }
    }

    public static void BFS(Queue<int[]> q) {
        Queue<int[]> temp = new LinkedList<>();
        while (!q.isEmpty()) {
            int[] now = q.poll();
            visited[now[0]][now[1]] = true;
            // 상하좌우로 탐색
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                // 해당 인덱스가 배열을 넘어가면 안됨
                if (x >= 0 && y >= 0 && x < N && y < M) {
                    // 해당 인덱스가 0이아니고 방문한적 없어야함
                    // -1은 방문했다고 치자
                    if (arr[x][y] == 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        arr[x][y] = 1;
                        count_zero--;
                        temp.add(new int[] { x, y });
                    }
                }
            }
        }
        if (!temp.isEmpty()) {
            days++;
            BFS(temp);
        }
    }
}