package BAEKJOON.Bronze.Bronze_V.P10950번_A더하기B_3;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int arr[] = new int[num];
      for(int i = 0;i<num; i++){
          int a = sc.nextInt();
          int b = sc.nextInt();
          arr[i] = a+b;
      }
      for(int i = 0;i<num; i++){
          System.out.println(arr[i]);
      }
      
      sc.close();
  }
}
