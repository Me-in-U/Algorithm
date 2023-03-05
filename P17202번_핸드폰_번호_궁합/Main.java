package P17202번_핸드폰_번호_궁합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> queue = new LinkedList<>();
    String num1 = br.readLine();
    String num2 = br.readLine();
    for (int i = 0; i < 8; i++) {
      queue.add(num1.charAt(i) - '0');
      queue.add(num2.charAt(i) - '0');
    }
    int size = 15;
    while (size >= 2) {
      Queue<Integer> temp = new LinkedList<>();
      for (int i = 0; i < size; i++) {
        temp.add((queue.poll() + queue.peek()) % 10);
      }
      queue = temp;
      size--;
    }
    System.out.print(Integer.toString(queue.poll()) + Integer.toString(queue.poll()));
  }
}