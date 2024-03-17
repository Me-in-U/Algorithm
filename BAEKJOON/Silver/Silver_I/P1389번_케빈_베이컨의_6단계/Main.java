package P1389번_케빈_베이컨의_6단계;

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

    int[][] arr = new int[N][N];
    for (int i = 0; i < N; i++) {
      Arrays.fill(arr[i], 9999);
      arr[i][i] = 0;
    }

    while (M-- > 0) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken()) - 1;
      int y = Integer.parseInt(st.nextToken()) - 1;
      arr[x][y] = arr[y][x] = 1;
    }

    for (int k = 0; k < N; k++)
      for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
          if (arr[i][j] > arr[i][k] + arr[k][j])
            arr[i][j] = arr[i][k] + arr[k][j];

    int minimumDegrees = 9999;
    int result = -1;
    for (int i = 0; i < N; i++) {
      int totalDegrees = 0;
      for (int j = 0; j < N; j++) {
        totalDegrees += arr[i][j];
      }
      if (minimumDegrees > totalDegrees) {
        minimumDegrees = totalDegrees;
        result = i;
      }
    }

    System.out.println(result + 1);
  }
}