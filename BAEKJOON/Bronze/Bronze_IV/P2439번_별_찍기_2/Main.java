package BAEKJOON.Bronze.Bronze_IV.P2439번_별_찍기_2;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(int i =1; i <=num; i++){
          for(int j =0;j<num-i;j++){
              System.out.print(" ");
          }
          for(int k = 1; k<=i;k++){
              System.out.print("*");
          }
          System.out.println();
      }
      sc.close();
  }
}