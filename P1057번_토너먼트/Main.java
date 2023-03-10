package P1057번_토너먼트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int Jimin = Integer.parseInt(st.nextToken());
    int Hansu = Integer.parseInt(st.nextToken());
    Queue<Boolean> queue = new LinkedList<>();
    for (int i = 1; i <= N; i++) {
      if (i != Jimin && i != Hansu) {
        queue.add(false);
      } else {
        queue.add(true);
      }
    }
    boolean found = false;
    int count = 0;
    while (!found) {
      if (queue.size() == 1) {
        count = -1;
        break;
      }
      int size = queue.size();
      for (int i = 0; i < size / 2; i++) {
        boolean a = queue.poll();
        boolean b = queue.poll();
        if (a && b) {
          found = true;
          break;
        }
        queue.add(a || b);
      }
      if (size % 2 == 1) {
        queue.add(queue.poll());
      }
      count++;
    }
    System.out.println(count);
  }
}