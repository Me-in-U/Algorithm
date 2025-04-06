package BAEKJOON.Silver.Silver_III.P26215번_눈_치우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      q.add(Integer.parseInt(st.nextToken()));
    }
    int time = 0;
    int x = 0;
    int y = 0;
    while (true) {
      if (!q.isEmpty() && (x == 0))
        x = q.poll();
      if (!q.isEmpty() && (y == 0))
        y = q.poll();

      if (x != 0 && y != 0) {
        int get_time = Math.min(x, y);
        time += get_time;
        x -= get_time;
        y -= get_time;
        if (x != 0) {
          q.add(x);
          x = 0;
        }
        if (y != 0) {
          q.add(y);
          y = 0;
        }
      } else if (y == 0) {
        time += x;
        x = 0;
      } else if (x == 0) {
        time += y;
        y = 0;
      }

      if (time > 1440) {
        System.out.println("-1");
        break;
      } else if (x == 0 && y == 0 && q.isEmpty()) {
        System.out.println(time);
        break;
      }
    }
  }
}