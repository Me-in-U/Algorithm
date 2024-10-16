package P29729번_가변_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int S0 = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int max = S0;
    int size = 0;
    for (int i = 0; i < N + M; i++) {
      int input = Integer.parseInt(br.readLine());
      if (input == 0) {
        size--;
      } else {
        if (max == size) {
          max *= 2;
        }
        size++;
      }
      max = Math.max(max, size);
    }
    System.out.println(max);
  }
}