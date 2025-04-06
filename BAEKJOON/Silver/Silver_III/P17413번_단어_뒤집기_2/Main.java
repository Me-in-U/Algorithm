package BAEKJOON.Silver.Silver_III.P17413번_단어_뒤집기_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb = new StringBuilder();
    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();
    
    String input = br.readLine();
    int index = 0;
    int length = input.length();
    while(index < length){
	  char c = input.charAt(index++);
	  if(c == '<'){
	    queue.add(c);
	    while(c != '>'){
	      c = input.charAt(index++);
	      queue.add(c);
    	}
    	while(!queue.isEmpty()){
    	  sb.append(queue.poll());
    	}
    	queue.clear();
      }
      else{
        stack.add(c);
        while(index < length){
          c = input.charAt(index++);
          if(c != ' ' && c != '<'){
            stack.add(c);
          }
          if(c == ' ' || c == '<' || index >= length){
            while(!stack.isEmpty()){
              sb.append(stack.pop());
            }
            if(c == ' '){
              sb.append(" ");
              break;
            }
            else if(c == '<'){
              index--;
              break;
            }
          }
        }
        stack.clear();
      }
    }
    System.out.println(sb);
  }
}