package BAEKJOON.Bronze.Bronze_V.P8370번_Plane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n1 = Integer.parseInt(st.nextToken());
    int n2 = Integer.parseInt(st.nextToken());
    int k1 = Integer.parseInt(st.nextToken());
    int k2 = Integer.parseInt(st.nextToken());
    System.out.println(((n1 * n2) + (k1 * k2)));
  }
}