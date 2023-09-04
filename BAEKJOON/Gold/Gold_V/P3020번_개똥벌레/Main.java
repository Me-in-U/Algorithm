package Gold_V.P3020번_개똥벌레;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());

    int[] count = new int[H + 1];
    boolean order = true;
    for (int i = 0; i < N; i++) {
      int a = Integer.parseInt(br.readLine());
      if (order) {
        for (int k = 1; k <= a; k++) {
          count[k]++;
        }
        order = false;
      } else {
        for (int k = H; k > H - a; k--) {
          count[k]++;
        }
        order = true;
      }
    }
    Arrays.sort(count);
    int min = count[1];
    int count_result = 1;
    for (int i = 2; i < H; i++) {
      if (count[i] > min) {
        break;
      } else {
        count_result++;
      }
    }
    System.out.println(min + " " + count_result);
  }
}