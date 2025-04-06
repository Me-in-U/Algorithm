package BAEKJOON.Bronze.Bronze_IV.P15059번_Hard_Choice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] available = br.readLine().split(" ");
    String[] requested = br.readLine().split(" ");
    int result = 0;
    if (Integer.parseInt(available[0]) < Integer.parseInt(requested[0])) {
      result += Integer.parseInt(requested[0]) - Integer.parseInt(available[0]);
    }
    if (Integer.parseInt(available[1]) < Integer.parseInt(requested[1])) {
      result += Integer.parseInt(requested[1]) - Integer.parseInt(available[1]);
    }
    if (Integer.parseInt(available[2]) < Integer.parseInt(requested[2])) {
      result += Integer.parseInt(requested[2]) - Integer.parseInt(available[2]);
    }
    System.out.println(result);
  }
}