package BAEKJOON.Bronze.Bronze_IV.P11720번_숫자의_합;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum = 0;
      String input = sc.next();
      for(int i = 0; i<num;i++){
          int c = (int)input.charAt(i)-48;
          sum+= c;
      }
      System.out.println(sum);
      sc.close();
  }
}
