package BAEKJOON.Bronze.Bronze_IV.P21664번_Миша_и_негатив;

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
    char[][] data = new char[N][M];
    char[][] comp = new char[N][M];
    for (int i = 0; i < N; i++)
      data[i] = br.readLine().toCharArray();
    br.readLine();
    for (int i = 0; i < N; i++)
      comp[i] = br.readLine().toCharArray();
    br.close();
    int count = 0;
    for (int i = 0; i < N; i++)
      for (int j = 0; j < M; j++)
        if (data[i][j] == comp[i][j])
          count++;
    System.out.println(count);
  }
}
