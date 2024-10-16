package Gold_II.P1918번_후위_표기식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(infixToPostfix(br.readLine()));
  }

  public static String infixToPostfix(String infix) {
    StringBuilder postfix = new StringBuilder();
    Deque<Character> stack = new LinkedList<>();

    for (char ch : infix.toCharArray()) {
      if (Character.isUpperCase(ch)) {
        postfix.append(ch);
      } else if (ch == '(') {
        stack.push(ch);
      } else if (ch == ')') {
        while (!stack.isEmpty() && (stack.peek() != '(')) {
          postfix.append(stack.pop());
        }
        stack.pop();
      } else {
        while (!stack.isEmpty() && (priority(ch) <= priority(stack.peek()))) {
          postfix.append(stack.pop());
        }
        stack.push(ch);
      }
    }
    while (!stack.isEmpty()) {
      postfix.append(stack.pop());
    }
    return postfix.toString();
  }

  public static int priority(char operator) {
    switch (operator) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      default:
        return -1;
    }
  }
}