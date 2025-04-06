package BAEKJOON.Silver.Silver_IV.P10845번_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;
class Main {  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue <Integer> queue = new LinkedList<>(); 
    int n = Integer.parseInt(br.readLine());
    int back_num = 0;
    for(int i = 0; i< n; i++){
      String input = br.readLine();
      StringTokenizer st = null;
      st = new StringTokenizer(input, " ");
      switch(st.nextToken()){
        case "push":
          int num = Integer.parseInt(st.nextToken());
          queue.add(num);
          back_num = num;
          break;
        case "pop" :
          if(queue.isEmpty() == true)
            System.out.println("-1");
          else
            System.out.println(queue.remove());
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
            System.out.println(queue.peek());
          break;
        case "back" :
          if(queue.isEmpty())
            System.out.println("-1");
          else
            System.out.println(back_num);
          break;
       }
    }
  }
}