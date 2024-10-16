package P10830번_행렬_제곱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int N;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    long B = Long.parseLong(st.nextToken());
    int[][] arr = new int[N][N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    int[][] result = power(arr, B);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sb.append(result[i][j]).append(' ');
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }

  public static int[][] power(int[][] arr, long B) {
    if (B == 1) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          arr[i][j] %= 1000;
        }
      }
      return arr;
    }
    int[][] half = power(arr, B / 2);
    int[][] result = multiplyMatrix(half, half);
    if (B % 2 == 1) {
      result = multiplyMatrix(result, arr);
    }
    return result;
  }

  public static int[][] multiplyMatrix(int[][] a, int[][] b) {
    int[][] result = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        result[i][j] = 0;
        for (int k = 0; k < N; k++) {
          result[i][j] = (result[i][j] + (a[i][k] * b[k][j])) % 1000;
        }
      }
    }
    return result;
  }
}
