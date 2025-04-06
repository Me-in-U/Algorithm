package BAEKJOON.Silver.Silver_IV.P1388번_바닥_장식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int count = 0;
    char[][] flo = new char[M][N];
    for (int i = 0; i < N; i++) {
      String inp = br.readLine();
      count += new StringTokenizer(inp, "|").countTokens();
      for (int j = 0; j < M; j++) {
        flo[j][i] = inp.charAt(j);
      }
    }
    for (int i = 0; i < M; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < N; j++) {
        sb.append(flo[i][j]);
      }
      count += new StringTokenizer(sb.toString(), "-").countTokens();
    }
    System.out.println(count);
  }
}