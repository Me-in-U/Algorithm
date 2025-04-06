package BAEKJOON.Bronze.Bronze_II.P15829번_Hashing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    long r = 1; //pow 31
    int M = 1234567891;
    long sum = 0;
    
    int L = Integer.parseInt(br.readLine());
    String input = br.readLine();

    //(A + B) mod M = ((A mod M) + (B mod M)) mod M
    for(int i = 0; i < L; i++){
      //(A mod M)
      sum += ((input.charAt(i) - 96) * r) % M;
      //(B mod M)
      r = (r * 31) % M;
    }
    //mod M
    bw.write(String.valueOf(sum % M));
    bw.newLine();
    bw.flush();
  }
}