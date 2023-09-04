package P2217번_로프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int max = 0;
    int N = Integer.parseInt(br.readLine());
    int[] list = new int[N];
    for (int i = 0; i < N; i++) {
      list[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(list);
    for (int i = 0; i < N; i++) {
      int available_load = list[i] * (N - i);
      if (max < available_load) {
        max = available_load;
      }
    }
    System.out.println(max);
  }
}