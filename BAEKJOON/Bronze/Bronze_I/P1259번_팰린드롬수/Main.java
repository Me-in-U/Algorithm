package BAEKJOON.Bronze.Bronze_I.P1259번_팰린드롬수;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input;
    for(;;){
      input = Integer.toString(sc.nextInt());      
      for(int i =0;;){
        if(input.length()==1){
          if(input.charAt(0)=='0'){
            break;
          }
          System.out.println("yes");
          break;
        }  
        if(input.length()!=1) {
          if(input.charAt(i)==input.charAt(input.length()-1-i)){
          i++;
          }
          else {
            System.out.println("no");
            break;
          }
          if(i==input.length()/2){
            System.out.println("yes");
            break;
          }
        }
      }
      if(input.length()==1&&input.charAt(0)=='0'){
        sc.close();
        break;
      }
     }
  }
}