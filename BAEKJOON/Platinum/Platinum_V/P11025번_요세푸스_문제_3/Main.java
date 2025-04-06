package BAEKJOON.Platinum.Platinum_V.P11025번_요세푸스_문제_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int result = 1;

    for (int i = 2; i <= N; i++) {
      // https://namu.wiki/w/%EC%9A%94%EC%84%B8%ED%91%B8%EC%8A%A4%20%EB%AC%B8%EC%A0%9C
      // f(n, k) = ((f(n - 1, k) + k - 1)) mod n) + 1
      // f(1,k)=1
      result = ((result + K - 1) % i) + 1;
    }
    System.out.println(result);
  }
}