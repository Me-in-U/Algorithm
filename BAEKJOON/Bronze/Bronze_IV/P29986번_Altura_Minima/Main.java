package BAEKJOON.Bronze.Bronze_IV.P29986번_Altura_Minima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());
    int count = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      if (Integer.parseInt(st.nextToken()) <= H) {
        count++;
      }
    }
    System.out.println(count);
  }
}