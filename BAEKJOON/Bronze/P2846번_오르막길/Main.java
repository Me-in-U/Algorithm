package P2846번_오르막길;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    int low = num;
    int high = 0;
    int up = 0;
    for (int i = 0; i < N - 1; i++) {
      num = Integer.parseInt(st.nextToken());
      if (high < num) {
        up = Math.max(up, num - low);
      } else {
        low = num;
      }
      high = num;
    }
    System.out.print(up);
  }
}