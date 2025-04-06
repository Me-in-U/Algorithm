package BAEKJOON.Silver.Silver_I.P6064번_카잉_달력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static int N, M, x, y;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      M = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());
      x = Integer.parseInt(st.nextToken());
      y = Integer.parseInt(st.nextToken());

      if (M == N) {
        if (x == y) {
          sb.append(x).append('\n');
        } else {
          sb.append("-1").append('\n');
        }
      } else {
        boolean unable = true;
        int count1 = x;
        int count2 = 0;
        int temp_y = get_y();
        int hop = Math.abs(M - N);
        if (M > N) {
          for (int K = 0; K < N; K++) {
            if (temp_y != y) {
              temp_y += hop;
              count2++;
              if (temp_y > N) {
                temp_y %= N;
                if (temp_y == 0) {
                  temp_y = N;
                }
              }
            }
            if (temp_y == y) {
              unable = false;
              break;
            }
          }
        } else {
          for (int K = 0; K < N; K++) {
            if (temp_y != y) {
              temp_y -= hop;
              count2++;
              if (temp_y <= 0) {
                temp_y = N - Math.abs(temp_y);
              }
            }
            if (temp_y == y) {
              unable = false;
              break;
            }
          }
        }
        if (unable) {
          sb.append("-1").append('\n');
        } else {
          sb.append(count1 + (M * count2)).append('\n');
        }
      }
    }
    System.out.print(sb.toString());
  }

  public static int get_y() {
    if (x % N == 0) {
      return N;
    } else {
      return x % N;
    }
  }
}