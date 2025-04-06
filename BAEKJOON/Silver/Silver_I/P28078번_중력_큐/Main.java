package BAEKJOON.Silver.Silver_I.P28078번_중력_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  protected static Deque<Character> queue = new ArrayDeque<>();
  protected static int rotateState = 0;
  protected static int countScreen = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");
      if (input[0].equals("push")) {
        if (input[1].equals("b")) {
          if (rotateState == 0 || rotateState == 2) {
            queue.addLast('b');
          } else if (countScreen > 0 && rotateState == 1) {
            queue.addLast('b');
          }
        } else {
          queue.addLast('w');
          countScreen++;
        }
      } else if (input[0].equals("pop")) {
        if (!queue.isEmpty()) {
          if (queue.peekFirst() == 'w')
            countScreen--;
          queue.removeFirst();
          if (rotateState == 1) {
            removeFirst();
          }
        }
      } else if (input[0].equals("rotate")) {
        if (input[1].equals("r")) {
          if (++rotateState == 4) {
            rotateState = 0;
          }
        } else {
          if (--rotateState == -1) {
            rotateState = 3;
          }
        }
        ifVertical();
      } else if (input[0].equals("count")) {
        if (input[1].equals("b"))
          sb.append(queue.size() - countScreen).append('\n');
        else
          sb.append(countScreen).append('\n');
      }
    }
    System.out.print(sb.toString());
  }

  public static void removeFirst() {
    while (!queue.isEmpty())
      if (queue.peekFirst() == 'b')
        queue.removeFirst();
      else
        break;
  }

  public static void removeLast() {
    while (!queue.isEmpty())
      if (queue.peekLast() == 'b')
        queue.removeLast();
      else
        break;
  }

  public static void ifVertical() {
    if (rotateState == 1)
      removeFirst();
    else if (rotateState == 3)
      removeLast();
  }
}
