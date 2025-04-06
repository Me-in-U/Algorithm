package BAEKJOON.Bronze.Bronze_III.P1085번_직사각형에서_탈출;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int point[] = new int[4];
    Scanner sc = new Scanner(System.in);
    for(int i =0; i<4;i++){
      point[i]= sc.nextInt();
    }
    point[2] -= point[0];
    point[3] -= point[1];
    int min = 1000;
    for (int i =0; i<4;i++){
      if(min>point[i]){
        min=point[i];
      }
    }
    sc.close();
    System.out.println(min);
  }
}