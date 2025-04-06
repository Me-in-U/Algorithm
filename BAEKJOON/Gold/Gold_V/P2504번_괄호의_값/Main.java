package BAEKJOON.Gold.Gold_V.P2504번_괄호의_값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    
    if (check(input)) {
      Stack<Integer> stk = new Stack<>();
      stk.add(0);
      for (int i = 0; i < input.length(); i++) {
        char c1 = input.charAt(i);
        if (c1 == ')') {
          stk.push((stk.pop() * 2) + stk.pop());
          continue;
        } else if (c1 == ']') {
          stk.push((stk.pop() * 3) + stk.pop());
          continue;
        }
        char c2 = input.charAt(i + 1);
        if (c1 == '(' && c2 != ')' || c1 == '[' && c2 != ']') {
          stk.push(0);
        } else if (c1 == '(' && c2 == ')') {
          stk.push(stk.pop() + 2);
          i++;
        } else if (c1 == '[' && c2 == ']') {
          stk.push(stk.pop() + 3);
          i++;
        }
      }
      System.out.println(stk.pop());
    } else {
      System.out.println(0);
    }
  }

  public static boolean check(String input) {
    Stack<Character> brackets = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == '(' || c == '[')
        brackets.push(c);
      else if (c == ')' || c == ']') {
        if (brackets.isEmpty())
          return false;
        else if (brackets.peek() == '(' && c == ')' || brackets.peek() == '[' && c == ']')
          brackets.pop();
        else
          brackets.push(c);
      }
    }
    return brackets.isEmpty();
  }
}