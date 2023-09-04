package P2740번_행렬곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[][] matrix_A = new int[N][M];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        matrix_A[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[][] matrix_B = new int[M][K];
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < K; j++) {
        matrix_B[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    StringBuilder sb = new StringBuilder();
    int[][] matrix_C = new int[N][K];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < K; j++) {
        for (int k = 0; k < M; k++) {
          matrix_C[i][j] += matrix_A[i][k] * matrix_B[k][j];
        }
        sb.append(matrix_C[i][j] + " ");
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}