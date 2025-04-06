package BAEKJOON.Bronze.Bronze_I.P10448번_유레카_이론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] Tn = new int[1001];
    for (int i = 1; i <= 1000; i++) {
      Tn[i] = Tn[i - 1] + i;
    }
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      int K = Integer.parseInt(br.readLine());
      int sum = 0;
      boolean found = false;
      while (!found) {
        for (int first = 1; first <= 1000 && !found; first++) {
          sum += Tn[first];
          if (sum > K) {
            sb.append("0").append('\n');
            found = true;
          }
          if (sum < K) {
            for (int second = 1; second <= 1000 && !found; second++) {
              sum += Tn[second];
              if (sum < K) {
                for (int third = 1; third <= 1000 && !found; third++) {
                  sum += Tn[third];
                  if (sum == K) {
                    sb.append("1").append('\n');
                    found = true;
                  }
                  sum -= Tn[third];
                }
              }
              sum -= Tn[second];
            }
          }
          sum -= Tn[first];
        }
      }
    }
    System.out.print(sb.toString());
  }
}