package P12865번_평범한_배낭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  protected static int N, K;
  protected static int[] weight;
  protected static int[] value;
  protected static int[][] result;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    weight = new int[N + 1];
    value = new int[N + 1];
    result = new int[N + 1][K + 1];
    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      weight[i] = Integer.parseInt(st.nextToken());
      value[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= K; j++) {
        if (weight[i] <= j) {
          result[i][j] = Math.max(result[i - 1][j], result[i - 1][j - weight[i]] + value[i]);
        } else {
          result[i][j] = result[i - 1][j];
        }
      }
    }
    System.out.println(result[N][K]);
  }
}