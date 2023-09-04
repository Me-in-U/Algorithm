package BAEKJOON.Bronze.P25828번_Corona_Virus_Testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int g = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    int individuallyTest = g * p;
    int groupTest = g + (p * t);
    if (individuallyTest < groupTest) {
      System.out.println(1);
    } else if (individuallyTest > groupTest) {
      System.out.println(2);
    } else {
      System.out.println(0);
    }
  }
}