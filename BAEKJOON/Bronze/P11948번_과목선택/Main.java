package P11948번_과목선택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    int[] input = new int[4];
    for (int i = 0; i < 4; i++) {
      input[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(input);
    for (int i = 1; i < 4; i++) {
      sum += input[i];
    }
    sum += Math.max(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
    System.out.print(sum);
  }
}