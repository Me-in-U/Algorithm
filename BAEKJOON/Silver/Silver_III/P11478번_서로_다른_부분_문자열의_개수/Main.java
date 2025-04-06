package BAEKJOON.Silver.Silver_III.P11478번_서로_다른_부분_문자열의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> set = new HashSet<String>();
    String input = br.readLine();
    for (int i = 0; i < input.length(); i++) {
      for (int j = i; j < input.length(); j++) {
        set.add(input.substring(i, j + 1));
      }
    }
    System.out.println(set.size());
  }
}