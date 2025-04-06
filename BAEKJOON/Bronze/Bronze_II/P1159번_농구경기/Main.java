package BAEKJOON.Bronze.Bronze_II.P1159번_농구경기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] count = new int[26];
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      count[br.readLine().charAt(0) - 'a']++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count.length; i++) {
      if (count[i] >= 5) {
        sb.append((char) (i + 'a'));
      }
    }
    if (sb.toString().equals("")) {
      System.out.println("PREDAJA");
    } else {
      System.out.println(sb.toString());
    }
  }
}
