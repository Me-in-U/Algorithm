package P2884번_알람_시계;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int m = sc.nextInt();
      int reculcu = (h*60) + m -45;
      if(reculcu<0){
          reculcu = (60- ((-1)*reculcu));
          h= 23;
          m =reculcu%60;
      }
      else{
          h= reculcu/60;
          m =reculcu%60;
      }
      System.out.println(h + " "+m);
      sc.close();
  }
}