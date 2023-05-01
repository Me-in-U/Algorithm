package P1008번_A나누기B;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    double c = a / b;
    System.out.println(c);
    sc.close();
  }
}