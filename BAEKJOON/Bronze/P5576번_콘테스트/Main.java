package P5576번_콘테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr1 = new int[10];
    int[] arr2 = new int[10];
    for (int i = 0; i < 10; i++) {
      arr1[i] = Integer.parseInt(br.readLine());
    }
    for (int i = 0; i < 10; i++) {
      arr2[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 7; i < 10; i++) {
      sum1 += arr1[i];
      sum2 += arr2[i];
    }
    System.out.println(sum1 + " " + sum2);
  }
}