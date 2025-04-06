package BAEKJOON.Gold.Gold_V.P28706번_럭키_세븐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder(T * 8);
    for (int i = 0; i < T; i++) {
      Set<Integer> set = new HashSet<>(1);
      int N = Integer.parseInt(br.readLine());
      set.add(1);
      for (int p = 0; p < N; p++) {
        Set<Integer> temp = new HashSet<>(set.size() * 2);
        String op = br.readLine();
        boolean isPlus1 = op.charAt(0) == '+';
        boolean isPlus2 = op.charAt(4) == '+';
        int v1 = op.charAt(2) - '0';
        int v2 = op.charAt(6) - '0';
        for (int num : set) {
          temp.add(isPlus1 ? num + v1 : num * v1);
          temp.add(isPlus2 ? num + v2 : num * v2);
        }
        set = temp;
      }
      boolean isLucky = false;
      for (int num : set) {
        if (num % 7 == 0) {
          isLucky = true;
          break;
        }
      }
      sb.append(isLucky ? "LUCKY\n" : "UNLUCKY\n");
    }
    System.out.print(sb.toString());
  }
}