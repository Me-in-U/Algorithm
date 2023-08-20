package P13496번_The_Merchant_of_Venice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int K = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= K; i++) {
      StringTokenizer st1 = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st1.nextToken());
      int s = Integer.parseInt(st1.nextToken());
      int d = Integer.parseInt(st1.nextToken());
      int ducats = 0;
      for (int j = 0; j < n; j++) {
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int di = Integer.parseInt(st2.nextToken());
        int vi = Integer.parseInt(st2.nextToken());
        if (s * d >= di) {
          ducats += vi;
        }
      }
      sb.append("Data Set ").append(i).append(":\n").append(ducats).append("\n\n");
    }
    System.out.print(sb.toString());
  }
}