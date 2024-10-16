package P13549번_숨바꼭질_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] time = new int[2000001];
    Arrays.fill(time, Integer.MAX_VALUE);
    time[N] = 0;
    Deque<Integer> dq = new ArrayDeque<>();
    dq.add(N);
    while (!dq.isEmpty()) {
      int now = dq.poll();
      if (now == K) {
        System.out.println(time[K]);
        break;
      }
      int tp = now * 2;
      if (tp <= 200000 && time[tp] > time[now]) {
        time[tp] = time[now];
        dq.addFirst(tp);
      }
      int walkLeft = now - 1;
      if (0 <= walkLeft && time[walkLeft] > time[now]) {
        time[walkLeft] = time[now] + 1;
        dq.addLast(walkLeft);
      }
      int walkRight = now + 1;
      if (walkRight <= 200000 && time[walkRight] > time[now]) {
        time[walkRight] = time[now] + 1;
        dq.addLast(walkRight);
      }
    }
  }
}