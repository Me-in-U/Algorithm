package BAEKJOON.Bronze.Bronze_I.P1546번_평균;

import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      float score[]=new float[a];
      for(int i=0;i<a;i++){
        score[i]=sc.nextFloat();
      }
      Arrays.sort(score);
      float max = score[a-1];
      float output = 0;
      for(int i=0;i<a;i++){
        score[i]=score[i]/max*100;
        output += score[i];
      }
      output = output/a;
      System.out.println(output);
      sc.close();
  }
}