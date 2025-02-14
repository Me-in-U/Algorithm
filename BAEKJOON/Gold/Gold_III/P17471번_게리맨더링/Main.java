package P17471번_게리맨더링;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static enum Group {
        A, B
    }

    private static List<ArrayList<Integer>> graph;
    private static int N;
    private static int[] population;

    public static void main(String[] args) throws IOException {
        N = readInt();
        population = new int[N];
        graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            population[i] = readInt();
            graph.add(new ArrayList<>());
        }
        for (int from = 0; from < N; from++) {
            int connectedCount = readInt();
            for (int i = 0; i < connectedCount; i++) {
                int to = readInt() - 1;
                graph.get(from).add(to);
                graph.get(to).add(from);
            }
        }
        System.out.print(searchAll());
    }

    private static int searchAll() {
        // !2개의 그룹으로 나눌 수 있는 모든 경우
        int min = 1001;
        for (int subset = 1; subset < ((1 << N) - 1); subset++) {
            Group[] area = new Group[N];
            for (int i = 0; i < N; i++) {
                area[i] = ((subset & (1 << i)) != 0) ? Group.A : Group.B;
            }
            int result = isConnected(area);
            if (result != -1) {
                min = (min < result) ? min : result;
            }
        }
        return min != 1001 ? min : -1;
    }

    private static int isConnected(Group[] area) {
        // !임시 그룹 A가 모두 연결된 지역인가
        int startA = -1;
        int countA = 0;
        for (int i = 0; i < N; i++) {
            if (area[i] == Group.A) {
                countA++;
                if (startA == -1) {
                    startA = i;
                }
            }
        }
        int visitedA = bfsCheckGroup(startA, area, Group.A);
        if (visitedA != countA) {
            return -1;
        }

        // !임시 그룹 B가 모두 연결된 지역인가
        int startB = -1;
        int countB = 0;
        for (int i = 0; i < N; i++) {
            if (area[i] == Group.B) {
                countB++;
                if (startB == -1) {
                    startB = i;
                }
            }
        }
        int visitedB = bfsCheckGroup(startB, area, Group.B);
        if (visitedB != countB) {
            return -1;
        }

        // !임시 그룹 A, B의 인구수 차이 리턴
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < N; i++) {
            if (area[i] == Group.A)
                sumA += population[i];
            else {
                sumB += population[i];
            }
        }
        return Math.abs(sumA - sumB);
    }

    // !BFS(특정 그룹의 인구수 계산이 포함 된)
    private static int bfsCheckGroup(int start, Group[] area, Group groupType) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(start);

        boolean[] visited = new boolean[N];
        visited[start] = true;

        int visitCount = 1;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : graph.get(cur)) {
                if (!visited[next] && (area[next] == groupType)) {
                    visited[next] = true;
                    queue.offer(next);
                    visitCount++;
                }
            }
        }
        return visitCount;
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
