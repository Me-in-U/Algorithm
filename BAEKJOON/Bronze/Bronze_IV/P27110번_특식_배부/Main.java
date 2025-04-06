package BAEKJOON.Bronze.Bronze_IV.P27110번_특식_배부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int result = 0;
    if (N <= a) {
      result += N;
    } else {
      result += a;
    }
    if (N <= b) {
      result += N;
    } else {
      result += b;
    }
    if (N <= c) {
      result += N;
    } else {
      result += c;
    }
    System.out.println(result);
  }
}