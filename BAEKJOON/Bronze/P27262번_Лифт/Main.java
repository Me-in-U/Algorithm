package BAEKJOON.Bronze.P27262번_Лифт;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int elevator = ((k == 1) ? 0 : (k - 1) * b) + ((n - 1) * b);
    int walk = ((n - 1) * a);
    StringBuilder sb = new StringBuilder();
    sb.append(elevator).append(' ').append(walk);
    System.out.print(sb.toString());
  }
}