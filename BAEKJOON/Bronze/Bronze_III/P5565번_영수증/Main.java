package BAEKJOON.Bronze.Bronze_III.P5565번_영수증;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int total = Integer.parseInt(br.readLine());
    for(int i = 0; i < 9; i++){
      int price = Integer.parseInt(br.readLine()); 
      total -= price;
    }
    bw.write(String.valueOf(total));
    bw.newLine();
    bw.flush();
  }
}