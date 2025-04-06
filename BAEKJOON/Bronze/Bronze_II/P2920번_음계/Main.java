package BAEKJOON.Bronze.Bronze_II.P2920번_음계;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] ascending = {1,2,3,4,5,6,7,8};
    int [] descending = {8,7,6,5,4,3,2,1};
    int [] input = {0,0,0,0,0,0,0,0};
    for(int i =0;i<8;i++){
        input[i] = sc.nextInt();
    }
    sc.close();
    int check = 0;
    for(int i = 0;i<8;i++){
        if(input[i]!=ascending[i])
            check = 1;
    }
    if(check == 1){
        for(int i = 0;i<8;i++){
            if(input[i]!=descending[i]){
                check = 2;
            }
        }
    }
    if(check==0)
        System.out.println("ascending");
    else if(check==1)
        System.out.println("descending");
    else
        System.out.println("mixed");
  }
}