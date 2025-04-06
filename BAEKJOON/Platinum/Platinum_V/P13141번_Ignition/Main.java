package BAEKJOON.Platinum.Platinum_V.P13141번_Ignition;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    // INF 값 및 전역 변수 선언
    private static final int INF = 400000001;
    private static int numNodes, numEdges;
    // 동적 할당: 입력 이후에 numNodes+1 크기로 할당
    private static int[][] shortestDist;
    // 1-indexed: 특정 시작 노드에서 각 노드가 불에 도달하는 시간을 저장
    private static int[] ignitionTime;
    // 간선 정보를 저장 (양방향)
    private static ArrayList<EdgeInfo> edges = new ArrayList<>();
    // 전체 네트워크가 불타는데 걸리는 최소 시간을 저장
    private static double minTime = INF;

    private static class EdgeInfo {
        int u, v, length;

        EdgeInfo(int u, int v, int length) {
            this.u = u;
            this.v = v;
            this.length = length;
        }
    }

    public static void main(String[] args) throws IOException {
        numNodes = readInt();
        numEdges = readInt();
        shortestDist = new int[numNodes + 1][numNodes + 1];
        ignitionTime = new int[numNodes + 1];

        // 초기화: 같은 노드 간의 거리는 0, 나머지는 INF로 설정
        for (int i = 1; i <= numNodes; i++)
            for (int j = 1; j <= numNodes; j++)
                shortestDist[i][j] = (i == j) ? 0 : INF;

        // 간선 입력 (1-indexed)
        for (int i = 0; i < numEdges; i++) {
            int from = readInt();
            int to = readInt();
            int len = readInt();
            edges.add(new EdgeInfo(from, to, len));
            // 양방향 최소값 갱신
            shortestDist[from][to] = Math.min(shortestDist[from][to], len);
            shortestDist[to][from] = Math.min(shortestDist[to][from], len);
        }
        getAllPairsShortestPaths();
        getMinTime();
        System.out.printf("%.1f\n", minTime);
    }

    // Floyd–Warshall 알고리즘으로 모든 쌍 최단 경로 계산
    private static void getAllPairsShortestPaths() {
        for (int k = 1; k <= numNodes; k++)
            for (int i = 1; i <= numNodes; i++)
                for (int j = 1; j <= numNodes; j++)
                    if (shortestDist[i][k] + shortestDist[k][j] < shortestDist[i][j])
                        shortestDist[i][j] = shortestDist[i][k] + shortestDist[k][j];
    }

    private static void getMinTime() {
        for (int start = 1; start <= numNodes; start++) {
            // start 노드에서 각 노드까지의 최단 거리(즉, 불이 도달하는 시간)를 ignitionTime에 저장
            for (int j = 1; j <= numNodes; j++) {
                ignitionTime[j] = shortestDist[start][j];
            }
            double maxBurnTimeForStart = 0;
            // 각 간선마다 해당 간선이 완전히 타는 시간을 계산
            for (EdgeInfo edge : edges) {
                int from = edge.u;
                int to = edge.v;
                int len = edge.length;
                // 시작 노드가 간선의 양 끝점 중 하나가 아니라면, 해당 간선의 길이에 양쪽 중 빠른 쪽의 도달시간을 더함
                if (from != start && to != start) {
                    len += Math.min(ignitionTime[from], ignitionTime[to]);
                }
                // 두 끝점 중 늦게 도달하는 시간
                double T1 = Math.max(ignitionTime[from], ignitionTime[to]);
                // 두 불이 만나서 남은 간선을 태우는 데 걸리는 추가 시간
                double T2 = (len - T1) / 2.0;
                if (T2 < 0) {
                    T2 = 0;
                }
                double burnTime = T1 + T2;
                maxBurnTimeForStart = Math.max(maxBurnTimeForStart, burnTime);
            }
            minTime = Math.min(minTime, maxBurnTimeForStart);
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
