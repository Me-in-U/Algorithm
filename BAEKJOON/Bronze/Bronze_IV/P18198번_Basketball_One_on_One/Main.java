package BAEKJOON.Bronze.Bronze_IV.P18198번_Basketball_One_on_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] data = br.readLine().toCharArray();
    int A = 0;
    int B = 0;
    for (int i = 0; i < data.length; i += 2) {
      if (data[i] == 'A') {
        A += data[i + 1] - '0';
      } else {
        B += data[i + 1] - '0';
      }
    }
    if (A > B) {
      System.out.println("A");
    } else {
      System.out.println("B");
    }
  }
}
