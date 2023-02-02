package P1697번_숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  protected static int N, K, time;
  protected static boolean[] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    time = 0;
    visited = new boolean[100001];
    Queue<Integer> input = new LinkedList<>();
    input.add(N);
    visited[N] = true;
    bfs(input);
    System.out.print(time);
  }

  public static void bfs(Queue<Integer> input) {
    Queue<Integer> queue = new LinkedList<>();
    while (!input.isEmpty()) {
      int get = input.poll();
      if (get == K) {
        break;
      }
      int pos1 = get - 1;
      int pos2 = get + 1;
      int pos3 = get * 2;
      if (pos1 >= 0 && !visited[pos1]) {
        queue.add(pos1);
        visited[pos1] = true;
      }
      if (pos2 <= 100000 && !visited[pos2]) {
        queue.add(pos2);
        visited[pos2] = true;
      }
      if (pos3 <= 100000 && pos3 != 0 && !visited[pos3]) {
        queue.add(pos3);
        visited[pos3] = true;
      }
      if (input.isEmpty()) {
        time++;
        input.addAll(queue);
        queue.clear();
      }
    }
  }
}