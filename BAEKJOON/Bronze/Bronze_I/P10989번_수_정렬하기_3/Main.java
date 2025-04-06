package BAEKJOON.Bronze.Bronze_I.P10989번_수_정렬하기_3;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int nums[] = new int[N];
    for(int i = 0; i<N; i++){
      nums[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(nums);
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<N; i++){
      sb.append(nums[i]).append('\n');
    }
    System.out.println(sb);
  }
}