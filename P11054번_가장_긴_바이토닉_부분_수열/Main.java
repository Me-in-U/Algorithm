package P11054번_가장_긴_바이토닉_부분_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  protected static int[] dpIncrement;
  protected static int[] dpDecrement;
  protected static int[] sequence;
  protected static int N;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    dpIncrement = new int[N];
    dpDecrement = new int[N];
    sequence = new int[N];
    String[] input = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      dpIncrement[i] = 1;
      dpDecrement[i] = 1;
      sequence[i] = Integer.parseInt(input[i]);
    }
    for (int i = 0; i < N; i++) {
      Increment(i);
    }
    for (int i = N - 1; i >= 0; i--) {
      Decrement(i);
    }
    int max = 0;
    for (int i = 0; i < N; i++) {
      max = Math.max(max, (dpDecrement[i] + dpIncrement[i]) - 1);
    }
    System.out.println(max);
  }

  public static void Increment(int startIndex) {
    for (int i = startIndex - 1; i >= 0; i--) {
      if (sequence[i] < sequence[startIndex]) {
        dpIncrement[startIndex] = Math.max(dpIncrement[startIndex], dpIncrement[i] + 1);
      }
    }
  }

  public static void Decrement(int startIndex) {
    for (int i = startIndex + 1; i < N; i++) {
      if (sequence[startIndex] > sequence[i]) {
        dpDecrement[startIndex] = Math.max(dpDecrement[startIndex], dpDecrement[i] + 1);
      }
    }
  }
}