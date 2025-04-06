package BAEKJOON.Bronze.Bronze_IV.P26068번_치킨댄스를_추는_곰곰이를_본_임스_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int count = 0;
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), "-");
      st.nextToken();
      if (Integer.parseInt(st.nextToken()) <= 90) {
        count++;
      }
    }
    System.out.println(count);
  }
}