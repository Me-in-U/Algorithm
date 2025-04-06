package BAEKJOON.Bronze.Bronze_I.P11170번_0의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    for (int k = 0; k < T; k++) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      int count = 0;
      for (int i = N; i <= M; i++) {
        String num = String.valueOf(i);
        for (int j = 0; j < num.length(); j++)
          if (num.charAt(j) == '0')
            count++;
      }
      sb.append(count).append('\n');
    }
    System.out.print(sb.toString());
    br.close();
  }
}