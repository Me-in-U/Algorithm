package BAEKJOON.Bronze.Bronze_II.P2577번_숫자의_개수;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = 1;
      for (int i =0; i <3;i++){
          num *= sc.nextInt();
      }
      sc.close();
      String a = Integer.toString(num);
      int count = 0;
      for(int i = 0;i<=9;i++){
          for(int j = 0;j<a.length();j++){
              if(a.charAt(j)==(char)(i+'0')){
                  count++;
              }
          }
          System.out.println(count);
          count = 0;
      }
  }
}