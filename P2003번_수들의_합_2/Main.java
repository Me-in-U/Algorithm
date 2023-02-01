package P2003번_수들의_합_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int[] nums = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }
    int p1 = 0;
    int p2 = 0;
    int sum = 0;
    int count = 0;
    while (true) {
      if (sum == M) {
        sum -= nums[p1++];
        count++;
      } else if (sum > M) {
        sum -= nums[p1++];
      } else if (p2 == N) {
        break;
      } else {
        sum += nums[p2++];
      }
    }
    System.out.print(count);
  }
}