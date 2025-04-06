package BAEKJOON.Silver.Silver_IV.P18258번_큐_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    Queue<Integer> queue = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    int last = 0;
    String input = "";
    StringTokenizer st = null;
    
    int N = Integer.parseInt(br.readLine());
    for(int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      input = st.nextToken();
      if(input.equals("push")){
        int X = Integer.parseInt(st.nextToken());
        queue.add(X);
        last = X;
      }
      else if(input.equals("pop")) {
        if (queue.isEmpty() == true)
          sb.append(-1).append('\n');
        else
          sb.append(queue.poll()).append('\n');
      }
      else if(input.equals("size"))
        sb.append(queue.size()).append('\n');
      else if(input.equals("empty")) {
        if(queue.isEmpty() == true)
          sb.append(1).append('\n');
        else
          sb.append(0).append('\n');
      }
      else if(input.equals("front")) {
        if(queue.isEmpty() == true)
          sb.append(-1).append('\n');
        else
          sb.append(queue.peek()).append('\n');
      }
      else if(input.equals("back")) {
        if(queue.isEmpty() == true)
          sb.append(-1).append('\n');
        else
          sb.append(last).append('\n');
      }
    }
    System.out.println(sb);
  }
}