package P15666번_N과_M_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
  protected static int N, M;
  protected static int[] output;
  protected static int[] num;
  protected static StringBuilder sb = null;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    HashSet<Integer> num_set = null;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    num = new int[N];
    output = new int[M];
    num_set = new HashSet<>(N);
    sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }
    Iterator<Integer> iter = num_set.iterator();
    int index = 0;
    while (iter.hasNext()) {
      num[index++] = iter.next();
    }

    Arrays.sort(num);

    dfs(0, 0);

    System.out.print(sb.toString());
  }

  public static void dfs(int start, int depth) {
    if (depth == M) {
      for (int i = 0; i < M; i++) {
        sb.append(output[i] + " ");
      }
      sb.append("\n");
      return;
    }
    int check = -1;
    for (int i = start; i < N; i++) {
      if (check != num[i]) {
        output[depth] = num[i];
        dfs(i, depth + 1);
        check = num[i];
      }
    }
  }
}