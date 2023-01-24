package P23795번_사장님_도박은_재미로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = 0;
    int sum = 0;
    while (-1 != (N = Integer.parseInt(br.readLine()))) {
      sum += N;
    }
    System.out.print(sum);
  }
}