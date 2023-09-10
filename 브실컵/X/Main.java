package 브실컵.X;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long N = Long.parseLong(st.nextToken());
    long M = Long.parseLong(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int T = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    long homeTime = getHomeTime(N, S);
    long dokTime = getDokTime(M, T, S);
    System.out.println(homeTime < dokTime ? "Zip" : "Dok");
    System.out.println(Math.min(homeTime, dokTime));
  }

  public static long getHomeTime(long N, int S) {
    if (N <= 8) {
      return N;
    }
    long loop = N / 8;
    long remainTime = N % 8;
    long homeTime = (loop * 8);
    if (remainTime != 0) {
      homeTime += (loop * S);
    } else {
      homeTime += ((loop - 1) * S);
    }
    if (N % 8 != 0) {
      homeTime += (N % 8);
    }
    return homeTime;
  }

  public static long getDokTime(long M, int T, int S) {
    if (M <= 8) {
      return M + T;
    }
    long loop = M / 8;
    long remainTime = M % 8;
    long dokTime = (loop * 8);
    if (remainTime == 0) {
      dokTime += ((loop - 1) * S) + (loop * T * 2) - T;
    } else {
      dokTime += (loop * S) + (loop * T * 2);
    }
    if (remainTime != 0) {
      dokTime += (T + remainTime);
    }
    return dokTime;
  }
}
