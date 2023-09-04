package P15474번_Pencils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int A = input[0] / input[1];
    if (input[0] % input[1] != 0) {
      A++;
    }
    int B = input[0] / input[3];
    if (input[0] % input[3] != 0) {
      B++;
    }
    System.out.println(Math.min(input[2] * A, input[4] * B));
  }
}