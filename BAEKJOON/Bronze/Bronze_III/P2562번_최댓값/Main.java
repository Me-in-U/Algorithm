package BAEKJOON.Bronze.Bronze_III.P2562번_최댓값;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int max = 0;
      int num = 0;
      for(int i =1; i<=9;i++){
          int get = sc.nextInt();
          if(get>max){
              max = get;
              num = i;
          }
      }
      System.out.println(max);
      System.out.println(num);
    
      sc.close();
  }
}

