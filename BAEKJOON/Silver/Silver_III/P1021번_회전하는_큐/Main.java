package BAEKJOON.Silver.Silver_III.P1021번_회전하는_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    LinkedList<Integer> list = new LinkedList<>();
    Queue<Integer> positions = new LinkedList<>();
    int move = 0;
    // 입력
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    for (int i = 1; i <= N; i++) {
      list.add(i);
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      positions.add(Integer.parseInt(st.nextToken()));
    }
    // 계산
    while (!positions.isEmpty()) {
      int indexOf = list.indexOf(positions.poll());
      int size = list.size();
      if (indexOf <= size / 2) {
        move += indexOf;
        for (int i = 0; i < indexOf; i++) {
          list.add(list.remove(0));
        }
      } else {
        move += size - indexOf;
        for (int i = 0; i < size - indexOf; i++) {
          list.add(0, list.remove(size - 1));
        }
      }
      list.remove(0);
    }
    // 출력
    System.out.println(move);
  }
}