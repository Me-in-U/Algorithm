package P14500번_테트로민;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int[][] arr = null;
    int max = 0;
    // 입력
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    arr = new int[N + 3][M + 3];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 계산
    int num = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        // ㅁ
        // ㅁ
        // ㅁㅁ
        num = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 2][j + 1];
        if (num > max)
          max = num;
        num = arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2] + arr[i][j + 2];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j];
        if (num > max)
          max = num;
        num = arr[i + 2][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i][j + 1];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2];
        if (num > max)
          max = num;
        // ㅁ
        // ㅁㅁ
        //// ㅁ
        num = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
        if (num > max)
          max = num;
        num = arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j] + arr[i + 1][j + 1];
        if (num > max)
          max = num;
        num = arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
        if (num > max)
          max = num;
        // ㅁㅁㅁㅁ
        num = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j];
        if (num > max)
          max = num;
        // ㅁㅁ
        // ㅁㅁ
        num = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
        if (num > max)
          max = num;
        // ㅁㅁㅁ
        //// ㅁ
        num = arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j];
        if (num > max)
          max = num;
        num = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1];
        if (num > max)
          max = num;
        num = arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
        if (num > max)
          max = num;
      }
    }
    System.out.println(max);
  }
}
/*
 * package P14500번_테트로민;
 * 
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 * import java.util.StringTokenizer;
 * import java.util.Collections;
 * import java.util.PriorityQueue;
 * 
 * public class Main {
 * public static void main(String[] args) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * StringTokenizer st = null;
 * PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
 * int[][] arr = null;
 * 
 * // 입력
 * st = new StringTokenizer(br.readLine());
 * int N = Integer.parseInt(st.nextToken());
 * int M = Integer.parseInt(st.nextToken());
 * arr = new int[N + 3][M + 3];
 * 
 * for (int i = 0; i < N; i++) {
 * st = new StringTokenizer(br.readLine());
 * for (int j = 0; j < M; j++) {
 * arr[i][j] = Integer.parseInt(st.nextToken());
 * }
 * }
 * 
 * // 계산
 * for (int i = 0; i < N; i++) {
 * for (int j = 0; j < M; j++) {
 * // ㅁ
 * // ㅁ
 * // ㅁㅁ
 * q.add(arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 2][j + 1]);
 * q.add(arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2] + arr[i][j + 2]);
 * q.add(arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1]);
 * q.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j]);
 * q.add(arr[i + 2][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1]);
 * q.add(arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2]);
 * q.add(arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i][j + 1]);
 * q.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2]);
 * // ㅁ
 * // ㅁㅁ
 * //// ㅁ
 * q.add(arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1]);
 * q.add(arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j] + arr[i + 1][j + 1]);
 * q.add(arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j]);
 * q.add(arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j + 2]);
 * // ㅁㅁㅁㅁ
 * q.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3]);
 * q.add(arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j]);
 * // ㅁㅁ
 * // ㅁㅁ
 * q.add(arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1]);
 * // ㅁㅁㅁ
 * //// ㅁ
 * q.add(arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2]);
 * q.add(arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j]);
 * q.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]);
 * q.add(arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1]);
 * }
 * }
 * System.out.println(q.poll());
 * }
 * }
 */