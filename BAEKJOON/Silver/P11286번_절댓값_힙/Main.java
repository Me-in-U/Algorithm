package P11286_절댓값_힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Collections;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    PriorityQueue<Integer> pq_plus = new PriorityQueue<>();
    PriorityQueue<Integer> pq_minus = new PriorityQueue<>(Collections.reverseOrder());
    
    int N = Integer.parseInt(br.readLine());
    for(int i = 0; i < N; i++){
      int x = Integer.parseInt(br.readLine());
      if(x == 0){
        if(pq_minus.size() > 0 && pq_plus.size() > 0){
          int a = pq_plus.peek();
          int b = pq_minus.peek() * -1;
          
          //절댓값이 같으면 마이너스 출력
          if(a == b)
            sb.append(pq_minus.poll()).append('\n');
          else if(a > b)
            sb.append(pq_minus.poll()).append('\n');
          else if(a < b)
            sb.append(pq_plus.poll()).append('\n');
        }        
        else if(pq_minus.size() == 0 && pq_plus.size() > 0)
          sb.append(pq_plus.poll()).append('\n');
        else if(pq_minus.size() > 0 && pq_plus.size() == 0)
          sb.append(pq_minus.poll()).append('\n');  
        else if(pq_minus.size() == 0 && pq_plus.size() == 0)
          sb.append("0").append('\n');
      }
      else{
        if(x > 0)
          pq_plus.add(x);        
        else if(x < 0)
          pq_minus.add(x);
      }
    }
    System.out.println(sb);
  }
}