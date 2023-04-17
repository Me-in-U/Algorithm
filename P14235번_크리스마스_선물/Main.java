package P14235번_크리스마스_선물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      if (a == 0) {
        if (pq.isEmpty()) {
          sb.append("-1").append('\n');
        } else {
          sb.append(pq.poll()).append('\n');
        }
      } else {
        while (st.hasMoreTokens()) {
          pq.add(Integer.parseInt(st.nextToken()));
        }
      }
    }
    System.out.print(sb.toString());
  }
}