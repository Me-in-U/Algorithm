package P16953번_AtoB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    System.out.println(bfs(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
  }

  public static int bfs(long A, long B) {
    Queue<Long> queue = new LinkedList<>();
    queue.add(A);
    int count = 1;
    boolean found = false;
    int added_count = 0;
    int queueSize = 1;
    while (!queue.isEmpty()) {
      long temp = queue.poll();
      if (temp == B) {
        found = true;
        break;
      }
      long temp1 = temp * 2;
      long temp2 = temp * 10 + 1;
      if (temp1 <= B) {
        queue.add(temp1);
      }
      if (temp2 <= B) {
        queue.add(temp2);
      }
      added_count++;
      if (added_count == queueSize) {
        count++;
        added_count = 0;
        queueSize = queue.size();
      }
    }
    return found ? count : -1;
  }
}