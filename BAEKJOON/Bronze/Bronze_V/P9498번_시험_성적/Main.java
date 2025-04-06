package BAEKJOON.Bronze.Bronze_V.P9498번_시험_성적;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a>=90)
          System.out.println("A");
      else if(a>=80&&a<=89)
          System.out.println("B");
      else if(a>=70&&a<=79)
          System.out.println("C");
      else if(a>=60&&a<=69)
          System.out.println("D");
      else
          System.out.println("F");
      sc.close();
  }
}