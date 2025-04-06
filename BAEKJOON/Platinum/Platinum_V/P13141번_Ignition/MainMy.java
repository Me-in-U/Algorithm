package BAEKJOON.Platinum.Platinum_V.P13141번_Ignition;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MainMy {
    private static class Fuse implements Comparable<Fuse> {
        int length;
        boolean selfConnect;

        Fuse(int length, boolean selfConnect) {
            this.length = length;
            this.selfConnect = selfConnect;
        }

        @Override
        public int compareTo(Fuse o) {
            return this.length - o.length;
        }

        public void burn() {
            length--;
            if (selfConnect) {
                length--;
            }
        }
    }

    private static List<Fuse>[][] originGraph;
    private static int N;
    private static int M;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        originGraph = new LinkedList[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                originGraph[i][j] = new LinkedList<>();
            }
        }
        for (int i = 0; i < M; i++) {
            int from = readInt() - 1;
            int to = readInt() - 1;
            int length = readInt() << 1;
            Fuse fuse = new Fuse(length, from == to);
            originGraph[from][to].add(fuse);
        }
        // 노드 2개간 연결된 간선 중 가장 짧은거, 가장 긴거만 남겨둠
        for (int from = 0; from < N; from++) {
            for (int to = 0; to < N; to++) {
                if (originGraph[from][to].size() > 2) {
                    Collections.sort(originGraph[from][to]);
                    int removeCount = originGraph[from][to].size() - 2;
                    while (removeCount-- > 0) {
                        originGraph[from][to].remove(1);
                    }
                }
                if (originGraph[from][to].size() == 2) {
                    if (originGraph[from][to].get(0).length == originGraph[from][to].get(1).length) {
                        originGraph[from][to].remove(1);
                    }
                }
            }
        }
        for (int from = 0; from < N; from++) {
            for (int to = from + 1; to < N; to++) {
                originGraph[to][from].addAll(originGraph[from][to]);
                // System.out.println("From" + (from + 1) + " to " + (to + 1) + ":");
                // for (Fuse f : originGraph[from][to]) {
                // System.out.println(f.length);
                // }
            }
        }
        // System.out.println("End Origin\n");
        int minTime = Integer.MAX_VALUE;
        for (int startNode = 0; startNode < N; startNode++) {
            minTime = Math.min(minTime, ignite(startNode));
            System.gc();
        }
        System.out.printf("%.1f", (double) minTime / 2.0);
    }

    private static int ignite(int start) {
        @SuppressWarnings("unchecked")
        List<Fuse>[][] graph = new LinkedList[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = new LinkedList<>();
            }
        }
        // i <= j 인 경우 한 번만 복사하고, i != j이면 반대쪽에도 동일 객체 추가
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                for (Fuse fuse : originGraph[i][j]) {
                    Fuse newFuse = new Fuse(fuse.length, fuse.selfConnect);
                    graph[i][j].add(newFuse);
                    if (i != j) {
                        graph[j][i].add(newFuse);
                    }
                }
            }
        }
        // for (int from = 0; from < N; from++) {
        // for (int to = 0; to < N; to++) {
        // System.out.println("From" + (from + 1) + " to " + (to + 1) + ":");
        // for (Fuse f : graph[from][to]) {
        // System.out.println(f.length);
        // }
        // }
        // }

        int time = 0;
        boolean[] ignited = new boolean[N];
        Deque<Integer> igniteFrom = new ArrayDeque<>();
        ignited[start] = true;
        igniteFrom.add(start);
        while (!igniteFrom.isEmpty() && !igniteFrom.isEmpty()) {
            int size = igniteFrom.size();
            boolean burned = false;
            while (size-- > 0) {
                int igniteNode = igniteFrom.poll();
                boolean remained = false;
                for (int to = 0; to < N; to++) {
                    if (!graph[igniteNode][to].isEmpty()) {
                        for (int i = 0; i < graph[igniteNode][to].size(); i++) {
                            if (graph[igniteNode][to].get(i).length <= 0) {
                                graph[igniteNode][to].remove(i);
                                i--;
                                continue;
                            }
                            graph[igniteNode][to].get(i).burn();
                            burned = true;
                            if (graph[igniteNode][to].get(i).length <= 0) {
                                if (!ignited[to]) {
                                    igniteFrom.add(to);
                                    ignited[to] = true;
                                }
                                graph[igniteNode][to].remove(i);
                                i--;
                            } else {
                                remained = true;
                            }
                        }
                    }
                }
                if (remained) {
                    igniteFrom.add(igniteNode);
                }
            }
            if (burned) {
                time++;
            }
            // System.out.println("----------------Time " + time + "-----------------");
            // System.out.println("q size " + igniteFrom.size());
            // for (int from = 0; from < N; from++) {
            // for (int to = 0; to < N; to++) {
            // System.out.println("From" + (from + 1) + " to " + (to + 1) + ":");
            // for (Fuse f : graph[from][to]) {
            // System.out.println(f.length);
            // }
            // }
            // }
        }
        return time;
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