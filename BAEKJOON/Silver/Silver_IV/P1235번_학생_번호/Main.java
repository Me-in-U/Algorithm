package BAEKJOON.Silver.Silver_IV.P1235번_학생_번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  static int N, length;
  static int min_length = 1;
  static String[] input;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    N = Integer.parseInt(br.readLine());
    input = new String[N];
    for (int i = 0; i < N; i++) {
      input[i] = br.readLine();
    }
    length = input[0].length();
    // 계산
    find_min_length();
    // 출력
    System.out.println(min_length);
  }

  public static void find_min_length() {
    boolean found = false;
    while (true) {
      HashSet<String> hashset = new HashSet<>();
      for (int i = 0; i < N; i++) {
        String substring = input[i].substring(length - min_length, length);
        if (!hashset.contains(substring))
          hashset.add(substring);
        else
          break;

        if (i == N - 1)
          found = true;
      }
      if (found)
        break;
      else
        min_length++;
    }
  }
}