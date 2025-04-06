package BAEKJOON.Bronze.Bronze_IV.P4589번_Gnome_Sequencing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    sb.append("Gnomes:").append('\n');
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      int[] inputInt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if ((inputInt[0] < inputInt[1] && inputInt[1] < inputInt[2]) ||
          (inputInt[0] > inputInt[1] && inputInt[1] > inputInt[2])) {
        sb.append("Ordered").append('\n');
      } else {
        sb.append("Unordered").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}