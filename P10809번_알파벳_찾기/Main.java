package P10809번_알파벳_찾기;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      for(int i =97; i<=122; i++){
              System.out.print(str.indexOf((char)i)+" ");
      }
      sc.close();
  }
}