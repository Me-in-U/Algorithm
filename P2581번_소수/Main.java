package P2581번_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    ArrayList<Integer> list = new ArrayList<>();
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());

    for(int i = N; i <= M; i++){
      boolean not_prime = false;
      if(i == 1)
        not_prime = true;      
      for(int j = 2; j < i; j++){
        if ((i % j) == 0){
          not_prime = true;
          break;
        }
      }
      if(!not_prime){
        list.add(i);
      }
    }

    if(list.isEmpty())
      System.out.println("-1");    
    else{
      int sum = 0;
      for(int i : list)
        sum += i;
      System.out.println(sum);
      System.out.println(list.get(0));
    }
  }
}
