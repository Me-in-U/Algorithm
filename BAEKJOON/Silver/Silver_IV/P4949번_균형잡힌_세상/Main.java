package BAEKJOON.Silver.Silver_IV.P4949번_균형잡힌_세상;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Stack<Character> stk = new Stack<>();
    boolean no = false;
    while(true){
      stk.clear();
      String str = br.readLine();
      if((str.length() == 1) && (str.charAt(0) == '.'))
          break;
      no = false;
      for(int i = 0; i < str.length(); i++){
        char c = str.charAt(i);
        if(c =='(' || c == '[')
          stk.add(c);
        else if (c == ')'){
          if(stk.isEmpty() || stk.peek() != '('){
            no = true;
            break;
          }
          else
            stk.pop();
        }
        else if (c == ']'){
          if(stk.isEmpty() || stk.peek() != '['){
            no = true;
            break;
          }
          else
            stk.pop();
        }
      }
      if(no == false && stk.isEmpty()){
        bw.write("yes");
        bw.newLine();
        bw.flush();
      }
      else{
        bw.write("no");
        bw.newLine();
        bw.flush();
      }
    }  
  }
}