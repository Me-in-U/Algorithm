package BAEKJOON.Silver.Silver_IV.P10866번_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
class Main {  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> queue = new ArrayDeque<>(); 
    int n = Integer.parseInt(br.readLine());
    for(int i = 0; i< n; i++){
      String input = br.readLine();
      StringTokenizer st = null;
      st = new StringTokenizer(input, " ");
      switch(st.nextToken()){
        case "push_front":
          int num = Integer.parseInt(st.nextToken());
          queue.addFirst(num);
          break;
        case "push_back":
          int num1 = Integer.parseInt(st.nextToken());
          queue.addLast(num1);
          break;
        case "pop_front" :
          if(queue.isEmpty() == true)
            System.out.println("-1");
          else
            System.out.println(queue.removeFirst());
          break;
        case "pop_back" :
          if(queue.isEmpty() == true)
            System.out.println("-1");
          else
            System.out.println(queue.removeLast());
          break;
        case "size" :
          System.out.println(queue.size());
          break;
        case "empty" :
          if(queue.isEmpty())
            System.out.println("1");
          else
            System.out.println("0");
          break;
        case "front" :
          if(queue.isEmpty())
            System.out.println("-1");
          else
            System.out.println(queue.peekFirst());
          break;
        case "back" :
          if(queue.isEmpty())
            System.out.println("-1");
          else
            System.out.println(queue.peekLast());
          break;
       }
    }
  }
}