package P11654번_아스키_코드;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String character = sc.next();
      char a = character.charAt(0);
      int ascii = (int) a;
      System.out.println(ascii);
      sc.close();
  }
}