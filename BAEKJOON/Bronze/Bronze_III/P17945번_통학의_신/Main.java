package BAEKJOON.Bronze.Bronze_III.P17945번_통학의_신;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int[] result = new int[2];
    result[0] = ((-2 * A) - (int) Math.sqrt(Math.pow((2 * A), 2) - (4 * B))) / 2;
    result[1] = ((-2 * A) + (int) Math.sqrt(Math.pow((2 * A), 2) - (4 * B))) / 2;

    if (result[0] < result[1]) {
      System.out.println(result[0] + " " + result[1]);
    } else if (result[0] > result[1]) {
      System.out.println(result[1] + " " + result[0]);
    } else {
      System.out.println(result[0]);
    }
  }
}