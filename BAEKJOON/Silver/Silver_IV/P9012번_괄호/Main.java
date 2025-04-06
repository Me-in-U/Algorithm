package BAEKJOON.Silver.Silver_IV.P9012번_괄호;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int total = 0;
    for(int i = 0; i< N; i++){
      total = 0;
      String input = br.readLine();
      for(int j = 0; j< input.length();j++){
        if(total >= 0){
          if(input.charAt(j) == '('){
            total++;
          }
          else{
            if(total == 0){
              total--;
              break;
            }
            else
              total--;
          }
        }
      }
      if(total == 0){
        bw.write(String.valueOf("YES"));
        bw.newLine();
        bw.flush();
      }
      else{
        bw.write(String.valueOf("NO"));
        bw.newLine();
        bw.flush();
      }
        
    }
  }
}
