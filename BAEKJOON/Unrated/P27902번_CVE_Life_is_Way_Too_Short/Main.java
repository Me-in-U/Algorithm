package BAEKJOON.Unrated.P27902번_CVE_Life_is_Way_Too_Short;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = BigInteger.valueOf(2L).pow(Integer.parseInt(br.readLine())).toString();
    if (a.length() > 4300) {
      System.out.println(a.substring(0, 4301));
    } else {
      System.out.println(a);
    }
  }
}