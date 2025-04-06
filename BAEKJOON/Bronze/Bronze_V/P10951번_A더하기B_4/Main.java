package BAEKJOON.Bronze.Bronze_V.P10951번_A더하기B_4;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNextInt()){
          int a = sc.nextInt();
          int b = sc.nextInt();
          System.out.println(a+b);
      }
      sc.close();
  }
}