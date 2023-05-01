package P1110번_더하기_사이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int new_N = N;
    int count = 0;
    
    count++;
    new_N = (N % 10 * 10) + (N / 10 + N % 10) % 10;
    while(true){
      if(new_N != N){
        count++;
        new_N = (new_N % 10 * 10) + (new_N / 10 + new_N % 10) % 10;
      }
      else
        break;
    }
    System.out.println(count);
  }
}