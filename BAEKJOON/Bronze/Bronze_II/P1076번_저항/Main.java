package BAEKJOON.Bronze.Bronze_II.P1076번_저항;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String resister[][] = new String [][] {{"black", "0", ""},{"brown","1","0"},{"red","2","00"},{"orange","3","000"},{"yellow","4","0000"},{"green","5","00000"},{"blue","6","000000"},{"violet","7","0000000"},{"grey","8","00000000"},{"white","9","000000000"}};

    String str = "";
    for (int i = 0; i < 3; i++){
      String input = br.readLine();
      for(int j = 0; j<10; j++){
        if (i<2){
          if(resister[j][0].equals(input))
            str+=resister[j][1];
        }
        else{
          if(resister[j][0].equals(input))
            str+=resister[j][2];
        }
      }
    }
    bw.write(String.valueOf(Long.parseLong(str)));
    bw.newLine();
    bw.flush();
  }
}