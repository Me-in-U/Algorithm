package BAEKJOON.Bronze.Bronze_II.P30009번_포지션_제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int X = Integer.parseInt(st.nextToken());
    st.nextToken();
    int R = Integer.parseInt(st.nextToken());
    int minX = X - R;
    int maxX = X + R;
    int insideCount = 0;
    int onlineCount = 0;
    for (int i = 0; i < N; i++) {
      int T = Integer.parseInt(br.readLine());
      if (minX < T && T < maxX) {
        insideCount++;
      } else if (minX == T || T == maxX) {
        onlineCount++;
      }
    }
    System.out.println(insideCount + " " + onlineCount);
  }
}