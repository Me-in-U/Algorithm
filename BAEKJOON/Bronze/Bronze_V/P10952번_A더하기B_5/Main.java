package BAEKJOON.Bronze.Bronze_V.P10952번_A더하기B_5;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNextInt()){
          int a = sc.nextInt();
          int b = sc.nextInt();
          if(a==0&&b==0)
              break;
          System.out.println(a+b);
      }
      sc.close();
  }
}