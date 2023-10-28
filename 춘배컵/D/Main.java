package 춘배컵.D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] startEnd = new int[M + 1];
    int minStart = 200000;
    int maxEnd = 1;
    for (int i = 0; i < N; i++) {
      int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int start = input[1];
      int end = input[input[0]];
      minStart = Math.min(minStart, start);
      maxEnd = Math.max(maxEnd, end);
      startEnd[start]++;
      startEnd[end]++;
    }
    int door = -1;
    int minDistanceSum = Integer.MAX_VALUE;
    for (int i = minStart; i <= maxEnd; i++) {
      int temp = 0;
      for (int j = minStart; j <= maxEnd; j++) {
        if (startEnd[j] != 0)
          temp += Math.abs(i - j) * startEnd[j];
      }
      if (temp < minDistanceSum) {
        minDistanceSum = temp;
        door = i;
      }
    }
    System.out.println(door);
  }
}