package P28110번_마지막_문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    String[] input = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }
    int newLevel = 1000000001;
    int maxLevelDiff = -1;
    Arrays.sort(arr);
    for (int i = 0; i < N - 1; i++) {
      int level1 = arr[i];
      int level2 = arr[i + 1];
      for (int level = level1 + 1; level < level2; level++) {
        int levelDiff = Math.min(level - level1, level2 - level);
        // System.out.println("Level " + level + ", levelDiff " + levelDiff);
        if (levelDiff > maxLevelDiff) {
          newLevel = level;
          maxLevelDiff = levelDiff;
        }
      }
    }
    if (newLevel == 1000000001) {
      System.out.println("-1");
    } else {
      System.out.println(newLevel);
    }
  }
}