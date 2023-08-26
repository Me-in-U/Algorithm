package 아니메컵.P2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      if (N == 1 && M == 1) {
        sb.append(1).append('\n');
      } else {
        int count = 0;
        int A = N + 1;
        int B = 1;
        if (N > M) {
          A = N + 1;
          B = 1;
        } else {
          count++;
          A = N;
          B = 2;
        }
        while (A != B) {
          if (A == 1) {
            A = N + 1;
          }
          // !빈공간 제거
          if (A > M + 1) {
            int diff = (N - M);
            A -= diff;
            B += diff;
            if (B > M) {
              B %= M;
            }
            count += diff;
            if (A == B) {
              break;
            }
          } else if (B > N) {
            int diff = M - B + 1;
            A = (A - diff) % N;
            if (A < 0) {
              A += N;
            }
            B = 1;
            count += diff;
            if (A == B) {
              break;
            }
          }
          // ! 중간 만나는 지점
          if (A > B) {
            int half = (A + B) / 2;
            if ((A + B) % 2 == 0) {
              count += (A - half);
              break;
            } else {
              count += A - half;
              B += A - half;
              if (B > M) {
                B %= M;
              }
              A -= (A - half);
            }
          } else {
            int min = Math.min(A - 1, M + 1 - B);
            A -= min;
            B += min;
            if (B > M) {
              B %= M;
            }
            count += min;
          }
        }
        sb.append(count).append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}