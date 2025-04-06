package BAEKJOON.Bronze.Bronze_IV.P17009번_Winning_Score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] totalScores = new int[2];
    for (int i = 0; i < 2; i++) {
      totalScores[i] += Integer.parseInt(br.readLine()) * 3;
      totalScores[i] += Integer.parseInt(br.readLine()) * 2;
      totalScores[i] += Integer.parseInt(br.readLine()) * 1;
    }
    if (totalScores[0] > totalScores[1]) {
      System.out.println("A");
    } else if (totalScores[0] < totalScores[1]) {
      System.out.println("B");
    } else {
      System.out.println("T");
    }
  }
}