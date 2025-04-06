package BAEKJOON.Bronze.Bronze_IV.P13118번_뉴턴과_사과;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] people = br.readLine().split(" ");
    String[] apple = br.readLine().split(" ");
    int hit = 0;
    for (int i = 0; i < 4; i++) {
      if (Integer.parseInt(people[i]) == Integer.parseInt(apple[0])) {
        hit = i + 1;
      }
    }
    System.out.println(hit);
  }
}