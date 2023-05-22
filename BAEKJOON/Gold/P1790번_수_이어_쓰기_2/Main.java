package BAEKJOON.Gold.P1790번_수_이어_쓰기_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  private static int min, N, K;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());

    if (length(N) < K) {
      System.out.println("-1");
    } else {
      min = 1;
      int num = binarySearch((min + N) / 2);

      String K_num = Integer.toString(num);
      // System.out.println("num: " + num);
      // System.out.println("mid 길이: " + length(num));
      // System.out.println("인덱스: " + (K_num.length() - 1 - (length(num) - K)));
      System.out.println(K_num.charAt((K_num.length() - 1) - (length(num) - K)) - '0');
    }
  }

  static int binarySearch(int mid) {
    while (min <= N) {
      mid = (min + N) / 2;
      if (K == length(mid)) {
        // System.out.println("마지막자리 : " + (mid));
        return mid;
      } else if (K < length(mid)) {
        N = mid - 1;
      } else {
        min = mid + 1;
      }
    }
    // System.out.println("역전 : " + (min));
    return min;
  }

  public static int length(int A) {
    int count = 0;
    for (int i = 1; i <= A; i *= 10) {
      count += (A - i) + 1;
    }
    return count;
  }
}