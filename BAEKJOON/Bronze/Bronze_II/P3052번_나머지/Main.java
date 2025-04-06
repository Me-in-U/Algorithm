package BAEKJOON.Bronze.Bronze_II.P3052번_나머지;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int []remains = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    int count = 0;
    for(int i = 0;i<10;i++){
        int num = sc.nextInt();
        remains[i] += (num%42);
        for(int j = 0; j<i;j++){
            if(remains[i]==remains[j]){
                count--;
                break;
            }
        }
        count++;
    }
    sc.close();
    System.out.println(count);
  }
}