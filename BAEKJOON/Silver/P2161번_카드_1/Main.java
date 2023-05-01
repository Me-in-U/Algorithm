package P2161번_카드_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Queue<Integer> queue = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= N; i++){
      queue.add(i);
    }
    while(true){
      sb.append(queue.poll()).append(" ");
      if(queue.isEmpty() == true){
        break;
      }
      else
        queue.add(queue.poll());
    }
    System.out.println(sb);
  }
}