package BAEKJOON.Bronze.Bronze_IV.P11943번_파일_옮기기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int C = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());
    System.out.println(Math.min((A + D), (B + C)));
  }
}