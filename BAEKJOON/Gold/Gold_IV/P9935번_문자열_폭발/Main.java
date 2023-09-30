package BAEKJOON.Gold.Gold_IV.P9935번_문자열_폭발;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  public static void main(String[] args) throws IOException {
    // !입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String bomb = br.readLine();
    Deque<Character> deque = new ArrayDeque<>();
    Deque<Character> temp = new ArrayDeque<>();
    // !계산
    for (char c : str.toCharArray()) {
      deque.addLast(c);
      if (deque.size() >= bomb.length()) {
        boolean isBomb = true;
        for (int i = bomb.length() - 1; i >= 0; i--) {
          char dequeChar = deque.pollLast();
          temp.addFirst(dequeChar);
          if (dequeChar != bomb.charAt(i)) {
            isBomb = false;
          }
        }
        if (!isBomb) {
          while (!temp.isEmpty()) {
            deque.addLast(temp.pollFirst());
          }
        } else {
          temp.clear();
        }
      }
    }
    // !출력
    StringBuilder sb = new StringBuilder();
    for (char c : deque) {
      sb.append(c);
    }
    String result = sb.toString();
    System.out.println(result.isEmpty() ? "FRULA" : result);
  }
}
