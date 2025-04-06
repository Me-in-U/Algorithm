package BAEKJOON.Silver.Silver_V.P15235번_Olympiad_Pizza;

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
    Queue<Integer> turn = new LinkedList<>();
    int N = Integer.parseInt(br.readLine());
    int time[] = new int[N+1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 1; i <= N; i++){
      queue.add(Integer.parseInt(st.nextToken()));
      turn.add(i);
    }
    int count = 1;
    time[0] = 0;
    while(!queue.isEmpty()){
      int pizza = queue.poll();
      int T = turn.poll();
      pizza--;
      if (pizza == 0){
        time[T] = count;
      }
      else{
        queue.add(pizza);
        turn.add(T);
      }
      count++;
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= N; i++){
      sb.append(time[i]).append(" ");
    }
    System.out.println(sb);
  }
}