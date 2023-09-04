package P11721번_열_개씩_끊어_출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();
    String input = br.readLine();
    for(int i = 0; i < input.length(); i = i + 10){
      if(i <= input.length() -10){
        sb.append(input.substring(i,i+10)).append('\n');
      }
      else{
        sb.append(input.substring(i,input.length()));
      }
    }
    System.out.println(sb);
  }
}