package BAEKJOON.Silver.Silver_I.P1629번_곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static long C;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    long A = Long.parseLong(st.nextToken());
    long B = Long.parseLong(st.nextToken());
    C = Long.parseLong(st.nextToken());

    System.out.println(pow(A, B));
  }

  // A^exponent
  public static long pow(long A, long exponent) {
    if (exponent == 1)
      return A % C;

    long temp = pow(A, exponent / 2);
    if (exponent % 2 == 1)
      return (temp * temp % C) * A % C;
    else
      return temp * temp % C;

  }
}