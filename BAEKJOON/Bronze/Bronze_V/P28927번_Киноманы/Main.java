package BAEKJOON.Bronze.Bronze_V.P28927번_Киноманы;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Макс = 0;
    int Мел = 0;
    int[] t1e1f1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] t2e2f2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Макс = t1e1f1[0] * 3 + t1e1f1[1] * 20 + t1e1f1[2] * 120;
    Мел = t2e2f2[0] * 3 + t2e2f2[1] * 20 + t2e2f2[2] * 120;
    if (Макс == Мел) {
      System.out.println("Draw");
    } else if (Макс > Мел) {
      System.out.println("Max");
    } else {
      System.out.println("Mel");
    }
  }
}
