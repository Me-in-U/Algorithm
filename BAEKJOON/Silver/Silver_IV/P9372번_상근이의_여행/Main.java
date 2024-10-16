package P9372번_상근이의_여행;

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
    int[] basket = new int[N];
    for (int p = 0; p < M; p++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      for (int a = i - 1; a < j; a++)
        basket[a] = k;
    }
    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < N; j++)
      sb.append(basket[j]).append(' ');
    System.out.print(sb.toString());
  }
}