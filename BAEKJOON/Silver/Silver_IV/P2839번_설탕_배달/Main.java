package P2839번_설탕_배달;

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
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    while(true) {
      //5로 바로 나눠 지면 끝
      if(N % 5 == 0) {
        bw.write(String.valueOf(N / 5 + count));
        bw.flush();
        bw.close();
        break;
      }
      else if(N <= 0) {
        bw.write(String.valueOf("-1"));
        bw.flush();
        bw.close();
        break;
      }
      //3빼고 다시 돌리기
      N -= 3;
      count++;
    }
  }
}