package BAEKJOON.Silver.Silver_IV.P1544번_사이클_단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<String> set = new HashSet<String>();
    int N = Integer.parseInt(br.readLine());
    int count = N;
    for (int i = 0; i < N; i++) {
      char[] word = br.readLine().toCharArray();
      for (int j = 0; j < word.length; j++) {
        if (!set.contains(String.valueOf(word))) {
          char first = word[0];
          for (int k = 1; k < word.length; k++) {
            word[k - 1] = word[k];
          }
          word[word.length - 1] = first;
        } else {
          count--;
          break;
        }
      }
      set.add(String.valueOf(word));
    }
    System.out.println(count);
  }
}