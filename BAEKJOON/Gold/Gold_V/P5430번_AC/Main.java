package BAEKJOON.Gold.Gold_V.P5430번_AC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
      StringBuilder sb = new StringBuilder();

      //테스트 케이스의 개수
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
         Deque<Integer> dq = new ArrayDeque<>();
         
         //수행 할 함수
         String p = br.readLine();
         
         //배열에 들어있는 수
         int n = Integer.parseInt(br.readLine());

         //배열 입력
         String input = br.readLine();
         input = input.substring(1, input.length() - 1);
         String arr[] = input.split(",");
         
         for(int j = 0; j < n; j++)
            dq.add(Integer.parseInt(arr[j]));    

         //함수 실행
         //배열이 비어있어도 R이오면 에러 아님**
         //뒤집혔으면 뒤에꺼 빼고 아님 앞에거 빼고         
         boolean reversed = false;
         boolean error = false;
         
         int p_length = p.length();
         for(int j = 0; j < p_length; j++) {
            char c = p.charAt(j);
            if(c == 'R'){
               if(reversed)
                  reversed = false;
               else
                  reversed = true;
            }
            else if(c == 'D'){
               if(dq.isEmpty()){
                  sb.append("error").append('\n');
                  error = true;
                  break;
               }
               else if(reversed)
                  dq.removeLast();               
               else
                  dq.removeFirst();                  
            }
         }

         //출력
         //뒤집혔으면 뒤에꺼 빼고 아님 앞에거 빼고
         if(!dq.isEmpty()){
            //sb.append("size = ").append(dq.size()).append(dq).append("reversed = ").append(reversed).append('\n');
            sb.append("[");
            int size = dq.size();
            if(!reversed){
               for(int j = 0; j < size; j++) {
                  sb.append(dq.removeFirst());
                  if(!dq.isEmpty())
                     sb.append(",");                  
               }
            }
            else{                  
               for(int j = size - 1; j >= 0; j--) {
                  sb.append(dq.removeLast());
                  if(!dq.isEmpty())
                     sb.append(",");                  
               }
            }
            sb.append("]").append('\n');
         }
         else if (dq.isEmpty() && error == false){
            sb.append("[]").append('\n');
         }
         
		}
      System.out.println(sb);
	}
}