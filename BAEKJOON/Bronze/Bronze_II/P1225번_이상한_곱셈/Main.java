package BAEKJOON.Bronze.Bronze_II.P1225번_이상한_곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    String a = st.nextToken();
    String b = st.nextToken();

    long sum = 0;
    for (int i = 0; i < a.length(); i++) {
      for (int j = 0; j < b.length(); j++) {
        sum += ((a.charAt(i) - '0') * (b.charAt(j) - '0'));
      }
    }
    System.out.println(sum);
  }
}