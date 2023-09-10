package 브실컵.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] input = Arrays.stream(br.readLine().split("-")).mapToInt(Integer::parseInt).toArray();
    int year = input[0];
    int month = input[1];
    int day = input[2] + Integer.parseInt(br.readLine());
    if (day > 30) {
      month += day / 30;
      day %= 30;
    }
    if (month > 12) {
      year += month / 12;
      month %= 12;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(year).append('-')
        .append(month < 10 ? '0' : "").append(month).append('-')
        .append(day < 10 ? '0' : "").append(day);
    System.out.print(sb.toString());
  }
}