package BAEKJOON.Bronze.Bronze_III.P2588번_곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  int N = Integer.parseInt(br.readLine());
  String M = br.readLine();
  
  int a = N * (M.charAt(2) - '0');
  int b = N * (M.charAt(1) - '0');
  int c = N * (M.charAt(0) - '0');
  int result = a + (b * 10) + (c * 100);
  
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(result);  
  }
}