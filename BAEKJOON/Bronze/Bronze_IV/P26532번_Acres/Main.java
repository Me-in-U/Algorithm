package BAEKJOON.Bronze.P26532번_Acres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    System.out.println((Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) / 24200) + 1);
  }
}