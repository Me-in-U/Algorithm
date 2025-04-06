package BAEKJOON.Silver.Silver_IV.P3036번_링;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] numbers = new int[N];
    for (int i = 0; i < N; i++) {
      numbers[i] = Integer.parseInt(st.nextToken());
    }
    int denominator = numbers[0];
    for (int i = 1; i < N; i++) {
      int numerator = numbers[i];
      int gcd = getGcd(numerator, denominator);
      System.out.println(denominator / gcd + "/" + numerator / gcd);
    }
  }

  public static int getGcd(int a, int b) {
    if (a % b == 0) {
      return b;
    }
    return getGcd(b, a % b);
  }
}