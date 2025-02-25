package P1406번_에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Deque<Character> L = new ArrayDeque<>();
    Deque<Character> R = new ArrayDeque<>();
    // !입력
    String input = br.readLine();
    for (int i = 0; i < input.length(); i++) {
      L.addLast(input.charAt(i));
    }
    // !계산
    int M = Integer.parseInt(br.readLine());
    for (int i = 0; i < M; i++) {
      String cmdLine = br.readLine();
      char c = cmdLine.charAt(0);
      if (c == 'P') {
        L.addLast(cmdLine.charAt(2));
      } else if (c == 'L') {
        if (!L.isEmpty())
          R.addFirst(L.removeLast());
      } else if (c == 'D') {
        if (!R.isEmpty())
          L.addLast(R.removeFirst());
      } else if (c == 'B') {
        if (!L.isEmpty())
          L.removeLast();
      }
    }
    // !출력
    while (!L.isEmpty())
      sb.append(L.removeFirst());
    while (!R.isEmpty())
      sb.append(R.removeFirst());
    System.out.println(sb.toString());
  }
}