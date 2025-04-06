package BAEKJOON.Bronze.Bronze_V.P15727번_조별과제를_하려는데_조장이_사라졌다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int L = Integer.parseInt(br.readLine());
    int t = L / 5;
    if (L % 5 != 0) {
      t++;
    }
    System.out.println(t);
  }
}