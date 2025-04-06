package BAEKJOON.Gold.Gold_V.P13023번_ABCDE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    protected static int N;
    protected static int M;
    protected static List<Integer>[] relation;
    protected static boolean[] visited;
    protected static boolean ABCDE;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        relation = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            relation[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int n1 = Integer.parseInt(input[0]);
            int n2 = Integer.parseInt(input[1]);
            relation[n1].add(n2);
            relation[n2].add(n1);
        }
        for (int i = 0; i < N; i++) {
            DFS(i, 1);
            if (ABCDE) {
                break;
            }
        }
        System.out.println(ABCDE ? 1 : 0);
    }

    public static void DFS(int now, int depth) {
        if (depth == 5) {
            ABCDE = true;
            return;
        }
        visited[now] = true;
        for (int i : relation[now]) {
            if (visited[i])
                continue;
            DFS(i, depth + 1);
        }
        visited[now] = false;
    }
}