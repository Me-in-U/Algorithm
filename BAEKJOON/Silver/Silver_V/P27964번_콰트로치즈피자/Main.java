package BAEKJOON.Silver.Silver_V.P27964번_콰트로치즈피자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] lines = br.readLine().split(" ");
    HashSet<String> set = new HashSet<>();
    for (int i = 0; i < N; i++) {
      if (lines[i].length() >= 6 && lines[i].substring(lines[i].length() - 6, lines[i].length()).equals("Cheese")) {
        set.add(lines[i]);
      }
    }
    if (set.size() >= 4) {
      System.out.println("yummy");
    } else {
      System.out.println("sad");
    }
  }
}
