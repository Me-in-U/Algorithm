package BAEKJOON.Bronze.Bronze_III.P2525번_오븐_시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    StringTokenizer st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int add = Integer.parseInt(br.readLine());
    int add_H = add / 60;
    int add_M = add % 60;
  
    M += add_M;
    if(M >= 60){
      H += M / 60;
      M = M % 60;
    }
    H += add_H;
    if(H >= 24){
      H = H % 24;
    }
    
    System.out.println(H + " " + M);
  }
}