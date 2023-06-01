package P1158번_요세푸스_문제;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // !입력
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);
    Deque<Integer> q = new LinkedList<>();
    for (int i = 1; i <= N; i++)
      q.add(i);
    // !계산
    StringBuilder sb = new StringBuilder();
    sb.append('<');
    while (q.size() != 1) {
      for (int i = 0; i < K - 1; i++) {
        q.add(q.poll());
      }
      sb.append(q.poll()).append(',').append(' ');
    }
    sb.append(q.poll()).append('>');
    // !출력
    System.out.print(sb);
  }
}