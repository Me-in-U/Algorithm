package BAEKJOON.Bronze.Bronze_I.P9506번_약수들의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = 0;
    while (-1 != (n = Integer.parseInt(br.readLine()))) {
      Queue<Integer> queue = new LinkedList<>();
      int sum = 0;
      for (int i = 1; i < n; i++) {
        if (n % i == 0) {
          queue.add(i);
          sum += i;
        }
      }
      if (sum == n) {
        sb.append(n + " = ");
        while (!queue.isEmpty()) {
          sb.append(queue.poll());
          if (!queue.isEmpty()) {
            sb.append(" + ");
          }
        }
        sb.append('\n');
      } else {
        queue.clear();
        sb.append(n + " is NOT perfect.").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}