package BAEKJOON.Bronze.Bronze_V.P2739번_구구단;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      for(int i = 1; i<=9; i++)
          System.out.println(a+" * " + i + " = " + a*i);
      sc.close();
  }
}