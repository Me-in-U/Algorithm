package BAEKJOON.Silver.Silver_V.P15904번_UCPC는_무엇의_약자일까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();
    int found = 0;
    char[] UCPC = { 'U', 'C', 'P', 'C' };
    for (int i = 0; i < input.length && found != 4; i++) {
      if (input[i] == UCPC[found]) {
        found++;
      }
    }
    if (found == 4) {
      System.out.println("I love UCPC");
    } else {
      System.out.println("I hate UCPC");
    }
  }
}