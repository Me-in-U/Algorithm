package P1406번_에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Stack<Character> L_stack = new Stack<>();
    Stack<Character> R_stack = new Stack<>();

    // 입력
    String input = br.readLine();
    for (int i = 0; i < input.length(); i++) {
      L_stack.push(input.charAt(i));
    }

    int M = Integer.parseInt(br.readLine());
    for (int i = 0; i < M; i++) {
      String cmd = br.readLine();
      if (cmd.charAt(0) == 'P') {
        L_stack.push(cmd.charAt(2));
      } else if (cmd.charAt(0) == 'L') {
        if (!L_stack.empty()) {
          R_stack.push(L_stack.pop());
        }
      } else if (cmd.charAt(0) == 'D') {
        if (!R_stack.empty()) {
          L_stack.push(R_stack.pop());
        }
      } else if (cmd.charAt(0) == 'B') {
        if (!L_stack.empty()) {
          L_stack.pop();
        }
      }
    }
    // 출력
    while (!L_stack.empty()) {
      R_stack.push(L_stack.pop());
    }
    while (!R_stack.empty()) {
      sb.append(R_stack.pop());
    }
    System.out.println(sb.toString());
  }
}