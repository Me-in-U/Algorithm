package P2908번_상수;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    int hund = a/100;
    int ten = (a-(hund*100))/10;
    int one = (a-(hund*100)-(ten*10));
    a = (one*100)+(ten*10)+hund;
    
    hund = b/100;
    ten = (b-(hund*100))/10;
    one = (b-(hund*100)-(ten*10));
    b = (one*100)+(ten*10)+hund;

    if(a>b)
        System.out.println(a);
    else
        System.out.println(b);
  }
}
