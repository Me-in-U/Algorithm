package P28062번_준석이의_사탕_사기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int oddMin = 1001;
    int oddSum = 0;
    int evenSum = 0;
    String[] input = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(input[i]);
      if (num % 2 == 0) {
        evenSum += num;
      } else {
        oddMin = Math.min(oddMin, num);
        oddSum += num;
      }
    }
    int result = evenSum + oddSum;
    if (oddSum % 2 != 0) {
      result -= oddMin;
    }
    System.out.println(result);
  }
}