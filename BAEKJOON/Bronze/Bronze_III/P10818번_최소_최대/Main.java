package P10818번_최소_최대;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int max = -1000000;
      int min = 1000000;
      for(int i = 0;i<num;i++){
          int input = sc.nextInt();
          if(input>max)
              max = input;
          if(input<min){
              min=input;
          }
      }
      System.out.println(min+" "+max);
      sc.close();
  }
}
