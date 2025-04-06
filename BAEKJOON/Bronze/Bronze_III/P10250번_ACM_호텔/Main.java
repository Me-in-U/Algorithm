package BAEKJOON.Bronze.Bronze_III.P10250번_ACM_호텔;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i = 0; i<T;i++){
      int H = sc.nextInt();
      sc.nextInt();
      int N = sc.nextInt();
      int room_H;
      int room_W;
      if((N%H)!=0){
        room_H = N%H;
        room_W = (N/H)+1;
      }
      else{
        room_H = H;
        room_W = N/H;
      }
      System.out.println((room_H*100)+room_W);
    }
    sc.close();
  }
}
