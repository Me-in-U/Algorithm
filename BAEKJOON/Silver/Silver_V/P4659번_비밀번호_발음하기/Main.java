package BAEKJOON.Silver.Silver_V.P4659번_비밀번호_발음하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

    String input = "";
    char prev = ' ';
		while(true){
      prev = ' ';
      boolean acceptable = true;
      input = br.readLine();
      if(input.equals("end")){
        break;
      }
      boolean moeum_exists = false;
      int moeum_count = 0;
      int jaeum_count = 0;
      for(int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
          if(moeum_exists == false)
            moeum_exists = true;
          moeum_count++;
          jaeum_count = 0;
          if(moeum_count == 3)
            acceptable = false;          
        }
        else{
          jaeum_count++;
          moeum_count = 0;
          if(jaeum_count == 3)
            acceptable = false;
        }
        if(c == prev){
          if(c == 'e' || c == 'o')
            continue;
          else
            acceptable = false;
        }
        if(!acceptable){
          break;
        }
        prev = c;
      }
      if(acceptable && moeum_exists)
        sb.append("<").append(input).append(">").append(" is acceptable.").append('\n');
      else
        sb.append("<").append(input).append(">").append(" is not acceptable.").append('\n');
    }
    System.out.println(sb);
	}
}