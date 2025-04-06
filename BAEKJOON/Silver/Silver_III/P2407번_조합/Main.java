package BAEKJOON.Silver.Silver_III.P2407번_조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    BigInteger result = BigInteger.valueOf(1);
    BigInteger div = BigInteger.valueOf(1);
    for (; m > 0; n--, m--) {
      result = result.multiply(BigInteger.valueOf(n));
      div = div.multiply(BigInteger.valueOf(m));
    }
    System.out.println(result.divide(div));
  }
}