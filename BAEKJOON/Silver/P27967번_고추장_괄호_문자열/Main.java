package BAEKJOON.Silver.P27967번_고추장_괄호_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    str = str.replaceAll("\\(\\)", "  ");
    System.out.println(str);
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < N; i++) {
      stack.push(str.charAt(i));
    }
    int countClose = 0;
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      char c = stack.pop();
      if (c == '(') {
        countClose--;
      } else if (c == ')') {
        countClose++;
      } else if (c == ' ') {
        stack.pop();
        sb.append(')').append('(');
        continue;
      } else {
        if (countClose == 0) {
          countClose++;
          c = ')';
        } else {
          countClose--;
          c = '(';
        }
      }
      sb.append(c);
    }
    System.out.println(sb.reverse());
  }
}
