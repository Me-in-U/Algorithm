package BAEKJOON.Silver.Silver_IV.P10828번_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stk = new Stack<>();
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      String input = br.readLine();
      StringTokenizer st = null;
      st = new StringTokenizer(input, " ");
      switch (st.nextToken()) {
        case "push":
          stk.push(Integer.parseInt(st.nextToken()));
          break;
        case "top":
          if (stk.isEmpty())
            sb.append("-1").append('\n');
          else
            sb.append(stk.peek()).append('\n');
          break;
        case "size":
          sb.append(stk.size()).append('\n');
          break;
        case "empty":
          if (stk.isEmpty())
            sb.append("1").append('\n');
          else
            sb.append("0").append('\n');
          break;
        case "pop":
          if (stk.isEmpty())
            sb.append("-1").append('\n');
          else
            sb.append(stk.pop()).append('\n');
          break;
        default:
          break;
      }
    }
    System.out.print(sb.toString());
  }
}