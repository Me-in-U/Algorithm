package P1977번_완전제곱수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    int min = 10001;
    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    for (double i = M; i <= N; i += 1.0) {
      if (Math.sqrt(i) % 1.0 == 0) {
        sum += i;
        if (min == 10001) {
          min = (int) i;
        }
      }
    }
    if (min == 10001) {
      System.out.println("-1");
    } else {
      System.out.println(sum);
      System.out.println(min);
    }
  }
}