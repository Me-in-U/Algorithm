package BAEKJOON.Bronze.Bronze_I.P15819번_너의_핸들은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int I = Integer.parseInt(st.nextToken());
    String[] arr = new String[N];

    for (int i = 0; i < N; i++) {
      arr[i] = br.readLine();
    }
    Arrays.sort(arr);
    System.out.println(arr[I - 1]);
  }
}