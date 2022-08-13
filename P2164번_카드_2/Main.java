package P2164번_카드_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Queue<Integer> list = new LinkedList<>();
    for(int i = 1; i<= N; i++){
      list.add(i);
    }
    while (list.size() > 1){
      list.poll();
      list.add(list.poll());
    }
    System.out.println(list.poll());
  }
}