package BAEKJOON.Bronze.Bronze_I.P28702번_FizzBuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static String[] lines = new String[3];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 3; i++) {
      lines[i] = br.readLine();
    }
    for (int i = 0; i < 3; i++) {
      if (isNumeric(lines[i])) {
        int num = Integer.parseInt(lines[i]);
        num += 3 - i;
        System.out.println(output(num));
        break;
      }
    }
  }

  public static boolean isNumeric(String str) {
    return str.matches("-?\\d+(\\.\\d+)?");
  }

  public static String output(int num) {
    if (num % 3 == 0 && num % 5 == 0) {
      return "FizzBuzz";
    } else if (num % 3 == 0 && num % 5 != 0) {
      return "Fizz";
    } else if (num % 3 != 0 && num % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(num);
    }
  }
}