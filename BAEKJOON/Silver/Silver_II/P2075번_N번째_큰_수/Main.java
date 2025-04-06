package BAEKJOON.Silver.Silver_II.P2075번_N번째_큰_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;

public class Main {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    // !입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Deque<Integer>[] deque = new ArrayDeque[N];
    for (int i = 0; i < N; i++) {
      deque[i] = new ArrayDeque<>(N);
    }
    for (int i = 0; i < N; i++) {
      int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int j = 0; j < N; j++) {
        deque[j].add(input[j]);
      }
    }
    // !계산
    PriorityQueue<int[]> pq = new PriorityQueue<>(N, (data1, data2) -> data2[0] - data1[0]);
    for (int i = 0; i < N; i++) {
      pq.add(new int[] { deque[i].removeLast(), i });
    }
    while (--N > 0) {
      int biggestNumIdx = pq.poll()[1];
      pq.add(new int[] { deque[biggestNumIdx].removeLast(), biggestNumIdx });
    }
    // !출력
    System.out.println(pq.poll()[0]);
  }
}