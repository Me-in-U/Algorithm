package BAEKJOON.Gold.Gold_III.P1238번_파티;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public static ArrayList<Road>[] roads;
  public static int[][] minTime;
  public static int N;
  public static int M;
  public static int X;

  static class Road implements Comparable<Road> {
    int village;
    int time;

    Road(int to, int time) {
      this.village = to;
      this.time = time;
    }

    @Override
    public int compareTo(Road o) {
      return this.time - o.time;
    }
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    X = Integer.parseInt(st.nextToken()) - 1;
    roads = new ArrayList[N];
    for (int i = 0; i < N; i++) {
      roads[i] = new ArrayList<>();
    }
    minTime = new int[N][N];
    for (int i = 0; i < N; i++) {
      Arrays.fill(minTime[i], 100000000);
      minTime[i][i] = 0;
    }
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken()) - 1;
      int to = Integer.parseInt(st.nextToken()) - 1;
      int time = Integer.parseInt(st.nextToken());
      roads[from].add(new Road(to, time));
    }
    for (int i = 0; i < N; i++) {
      getMineTimes(i);
    }
    int max = 0;
    for (int i = 0; i < N; i++) {
      max = Math.max(max, minTime[i][X] + minTime[X][i]);
    }
    System.out.println(max);
  }

  public static void getMineTimes(int from) {
    PriorityQueue<Road> pq = new PriorityQueue<Road>();
    boolean[] visited = new boolean[N];
    pq.add(new Road(from, 0));
    while (!pq.isEmpty()) {
      Road r = pq.poll();
      if (!visited[r.village]) {
        visited[r.village] = true;
        for (Road nextRoad : roads[r.village]) {
          if (minTime[from][nextRoad.village] > nextRoad.time + minTime[from][r.village]) {
            minTime[from][nextRoad.village] = nextRoad.time + minTime[from][r.village];
            pq.add(new Road(nextRoad.village, minTime[from][nextRoad.village]));
          }
        }
      }
    }
  }
}