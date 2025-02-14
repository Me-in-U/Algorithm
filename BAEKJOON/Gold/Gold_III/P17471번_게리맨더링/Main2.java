package P17471번_게리맨더링;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main2 {
    // Group enum 정의: A, B 두 그룹
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

    // N개의 지역 2개로 나눠서 그룹에 속한 지역이 서로 연결 되어있는지 검사
    private static int searchAll() {
        int min = 1001;
        // 1부터 (1 << N) - 1까지 모든 부분집합을 순회
        // 예시 N이 6일때 000001 ~ 011111까지
        for (int subset = 1; subset < ((1 << N) - 1); subset++) {
            Group[] area = new Group[N];
            for (int i = 0; i < N; i++) {
                // subset의 i번째 비트가 1이면 A그룹, 0이면 B그룹
                area[i] = ((subset & (1 << i)) != 0) ? Group.A : Group.B;
            }

            // 그룹 A와 B의 구역 번호를 문자열로 출력
            // StringBuilder groupA = new StringBuilder();
            // StringBuilder groupB = new StringBuilder();
            // for (int i = 0; i < N; i++) {
            // if (area[i] == Group.A) {
            // groupA.append(i + 1).append(' ');
            // } else {
            // groupB.append(i + 1).append(' ');
            // }
            // }
            // System.out.println("그룹 A : " + groupA);
            // System.out.println("그룹 B : " + groupB);

            // 연결성 검사
            int result = isConnected(area);
            if (result != -1) {
                min = min < result ? min : result;
            }
            // System.out.println("연결 여부 혹은 인구수 차이: " + result + "\n");
        }
        return min != 1001 ? min : -1;
    }

    private static int isConnected(Group[] area) {
        // 그룹 A에 속한 노드 찾기
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

        // 그룹 B에 속한 노드 찾기
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

        // 그룹 A 연결 검사
        int visitedA = bfsCheckGroup(startA, area, Group.A);
        if (visitedA != countA) {
            // System.out.println("그룹 A 연결안됨");
            return -1;
        }

        // 그룹 B 연결 검사
        int visitedB = bfsCheckGroup(startB, area, Group.B);
        if (visitedB != countB) {
            // System.out.println("그룹 B 연결안됨");
            return -1;
        }

        // 두 그룹의 인구 차이를 계산
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
