package P10828번_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
class Main {  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack <Integer> stk = new Stack<>(); 
    int n = Integer.parseInt(br.readLine());
    for(int i = 0; i< n; i++){
      String input = br.readLine();
      StringTokenizer st = null;
      st = new StringTokenizer(input, " ");
      switch(st.nextToken()){
        case "push":
          stk.push(Integer.parseInt(st.nextToken()));
          break;
        case "top" :
          if(stk.isEmpty())
            System.out.println("-1");
          else
            System.out.println(stk.peek());
          break;
        case "size" :
          System.out.println(stk.size());
          break;
        case "empty" :
          if(stk.isEmpty())
            System.out.println("1");
          else
            System.out.println("0");
          break;
        case "pop" :
          if(stk.isEmpty() == true)
            System.out.println("-1");
          else
            System.out.println(stk.pop());
          break;
       }
    }
  }
}