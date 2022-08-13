package P2675번_문자열_반복;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int test_count = sc.nextInt();
      int repeat_count[] = new int[test_count];
      String str[] = new String[test_count];
      for(int i = 0; i<test_count; i++){
          repeat_count[i]= sc.nextInt();
          str[i] = sc.next();
      }
      /*테스트수*/
      for(int i = 0; i<test_count; i++){
          /*한글자확인*/
          for(int j = 0;j<str[i].length();j++){
              /*한글자반복*/
              for(int k = 1; k<=repeat_count[i]; k++){
                  char print = str[i].charAt(j);
                  System.out.print(print);
              }
          }
          System.out.println();
      }
      sc.close();
  }
}