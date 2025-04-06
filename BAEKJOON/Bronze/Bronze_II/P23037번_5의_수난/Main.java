package BAEKJOON.Bronze.Bronze_II.P23037번_5의_수난;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    double arr[] = new double[input.length()];
    for(int i = 0; i < input.length(); i++){
      arr[i] = input.charAt(i) - 48;
    }
    double result = 0;
    for(int i = 0; i < input.length(); i++){
      arr[i] = Math.pow(arr[i], 5);
      result += arr[i];
    }
    System.out.println((int)result);
  }
}