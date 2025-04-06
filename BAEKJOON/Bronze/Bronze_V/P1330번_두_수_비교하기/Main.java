package BAEKJOON.Bronze.Bronze_V.P1330번_두_수_비교하기;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double a = sc.nextInt();
      double b = sc.nextInt();
      if(a>b)
          System.out.println(">");
      else if(a<b)
          System.out.println("<");
      else
          System.out.println("==");
      sc.close();
  }
}