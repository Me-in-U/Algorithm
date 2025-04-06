package BAEKJOON.Silver.Silver_III.P14425번_문자열_집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    HashSet<String> set = new HashSet<>();

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int count = 0;

    for (int i = 0; i < N; i++) {
      set.add(br.readLine());
    }
    for (int i = 0; i < M; i++) {
      if (set.contains(br.readLine())) {
        count++;
      }
    }
    System.out.println(count);
    br.close();
  }
}
