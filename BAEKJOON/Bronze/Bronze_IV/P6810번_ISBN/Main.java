package BAEKJOON.Bronze.Bronze_IV.P6810번_ISBN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("The 1-3-sum is " + (Integer.parseInt(br.readLine()) + (Integer.parseInt(br.readLine()) * 3)
        + Integer.parseInt(br.readLine()) + 91));
  }
}