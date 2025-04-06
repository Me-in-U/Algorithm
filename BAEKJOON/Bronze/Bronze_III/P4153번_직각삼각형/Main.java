package BAEKJOON.Bronze.Bronze_III.P4153번_직각삼각형;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]= new int[3];
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(;;){
      for(int i = 0; i<3;i++){
        arr[i] = sc.nextInt();
      }
      if(arr[0]==0&&arr[1]==0&&arr[2]==0){
        sc.close();
        break;
      }
      Arrays.sort(arr);
      if(((arr[0]*arr[0])+(arr[1]*arr[1]))==(arr[2]*arr[2])){
        result.add(1);
      }
      else{
        result.add(0);
      }
    }
    for(int i = 0; i<result.size();i++){
      int a = result.get(i);
      if(a==1){
        System.out.println("right");
      }
      else if(a==0){
        System.out.println("wrong");
      }
    }
  } 
}