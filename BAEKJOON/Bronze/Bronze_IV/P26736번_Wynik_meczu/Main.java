package BAEKJOON.Bronze.Bronze_IV.P26736번_Wynik_meczu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    long A = line.chars().filter(c -> c == 'A').count();
    System.out.println(A + " : " + (line.length() - A));
  }
}