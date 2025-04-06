package BAEKJOON.Silver.Silver_II.P5397번_키로거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      String input = br.readLine();
      Deque<Character> L = new ArrayDeque<>();
      Deque<Character> R = new ArrayDeque<>();
      for (int j = 0; j < input.length(); j++) {
        char c = input.charAt(j);
        if (c == '<') {
          if (!L.isEmpty())
            R.addFirst(L.removeLast());
        } else if (c == '>') {
          if (!R.isEmpty())
            L.addLast(R.removeFirst());
        } else if (c == '-') {
          if (!L.isEmpty())
            L.removeLast();
        } else {
          L.addLast(c);
        }
      }
      while (!L.isEmpty())
        sb.append(L.removeFirst());
      while (!R.isEmpty())
        sb.append(R.removeFirst());
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}