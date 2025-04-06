package BAEKJOON.Bronze.Bronze_II.P2292번_벌집;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {
    //코드입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = 2;
    int b = 7;
    int a_multi = 1;
    int b_multi = 2;
    int N = Integer.parseInt(br.readLine());
    for(;;){
      if(N==1){
        bw.write(String.valueOf(a_multi));
        bw.flush();
        break;
      }
      else if((a<=N) && (N<=b)){
        bw.write(String.valueOf(b_multi));
        bw.flush();
        break;
      }
      else if(b<=1000000000) {
        a += 6 * a_multi;
        b += 6 * b_multi;
        //bw.write(String.valueOf(a+" ~ "+ b));
        //bw.newLine();
        //bw.flush();
        a_multi++;
        b_multi++;
      }
    }
  }
}
