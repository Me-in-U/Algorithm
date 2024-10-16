package P14938번_서강그라운드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public static int N, M, R, maxItems_temp, result;
  public static ArrayList<Node>[] nodes;
  public static int[] items;
  public static int[] shortest;

  public static class Node implements Comparable<Node> {
    int number;
    int distance;

    Node(int number, int distance) {
      this.number = number;
      this.distance = distance;
    }

    @Override
    public int compareTo(Node o) {
      return this.distance - o.distance;
    }
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    R = Integer.parseInt(st.nextToken());
    result = 0;
    nodes = new ArrayList[N];
    for (int i = 0; i < N; i++) {
      nodes[i] = new ArrayList<>();
    }
    items = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      items[i] = Integer.parseInt(st.nextToken());
    }
    for (int i = 0; i < R; i++) {
      st = new StringTokenizer(br.readLine());
      int regionA = Integer.parseInt(st.nextToken()) - 1;
      int regionB = Integer.parseInt(st.nextToken()) - 1;
      int distance = Integer.parseInt(st.nextToken());
      nodes[regionA].add(new Node(regionB, distance));
      nodes[regionB].add(new Node(regionA, distance));
    }
    for (int i = 0; i < N; i++) {
      int maxDistance = search(i);
      // System.out.println("node" + (i + 1) + "에서: " + maxDistance);
      result = Math.max(result, maxDistance);
    }
    System.out.println(result);
  }

  public static int search(int startNode) {
    PriorityQueue<Node> pq = new PriorityQueue<>();
    shortest = new int[N];
    Arrays.fill(shortest, 10000);
    shortest[startNode] = 0;
    pq.add(new Node(startNode, 0));
    while (!pq.isEmpty()) {
      Node nd = pq.poll();
      for (int i = 0; i < nodes[nd.number].size(); i++) {
        int nodeNumber = nodes[nd.number].get(i).number;
        int nodeDistance = nodes[nd.number].get(i).distance;
        if (shortest[nodeNumber] > nodeDistance + shortest[nd.number]) {
          shortest[nodeNumber] = nodeDistance + shortest[nd.number];
          pq.add(new Node(nodeNumber, shortest[nodeNumber]));
        }
      }
    }
    int maxItems = 0;
    for (int i = 0; i < N; i++) {
      if (shortest[i] <= M) {
        maxItems += items[i];
      }
    }
    return maxItems;
  }
}