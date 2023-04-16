package PB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] count = new int[10];
    String[] input = br.readLine().split(" ");
    int[] AB = { Integer.parseInt(input[0]), Integer.parseInt(input[1]) };
    for (int i = 0; i < 2; i++) {
      for (int j = 9; AB[i] > 0; j--) {
        if (AB[i] >= Math.pow(2, j)) {
          AB[i] -= Math.pow(2, j);
          count[j]++;
        }
      }
    }
    int C = 0;
    for (int i = 0; i < 10; i++) {
      if (count[i] == 1) {
        C += Math.pow(2, i);
      }
    }
    System.out.println(C);
  }
}