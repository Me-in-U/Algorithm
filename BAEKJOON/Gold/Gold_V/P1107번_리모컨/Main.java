package BAEKJOON.Gold.Gold_V.P1107번_리모컨;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static int N;
  private static int M;
  private static boolean[] brokenButton;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 입력
    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());
    brokenButton = new boolean[10];
    if (M != 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < M; i++) {
        brokenButton[Integer.parseInt(st.nextToken())] = true;
      }
    }
    // 계산
    int count = 0;
    if (N != 100) {
      // 누를 버튼이 없을때 && +,-로만 이동할 때
      count = Math.abs(N - 100);
      // 0번 채널일때, 0번 버튼이 있으면, 0번 버튼 누르고 채널까지 이동
      if (!brokenButton[0])
        count = Math.min(count, 1 + N);
      // 1번 ~ 1,000,000번 채널일때
      for (int channel = 1; channel <= 1000000; channel++) {
        int firstCount = allChannel(channel);
        if (firstCount != 0) {
          count = Math.min(count, firstCount + Math.abs(N - channel));
        }
      }
    }
    // 출력
    System.out.println(count);
  }

  public static int allChannel(int channel) {
    int firstCount = 0;
    while (channel > 0) {
      if (brokenButton[channel % 10]) {
        return 0;
      } else {
        channel /= 10;
        firstCount++;
      }
    }
    return firstCount;
  }
}