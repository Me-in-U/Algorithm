package 보라매컵.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    long P = Long.parseLong(st.nextToken());
    boolean unable = false;
    for (int i = 1; i <= N; i++) {
      int[] level = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
      if (!unable) {
        int items = 0;
        for (int j = 0; j < M; j++) {
          if (level[j] == -1) {
            items++;
          } else if (level[j] >= 0) {
            if (P >= level[j]) {
              P += level[j];
            } else if (P < level[j]) {
              while (items > 0) {
                P *= 2;
                items--;
                if (P >= level[j]) {
                  break;
                }
              }
              if (P >= level[j]) {
                P += level[j];
              } else {
                unable = true;
              }
            }
          }
        }
        while (items > 0) {
          P *= 2;
          items--;
        }
      }
    }
    System.out.println(unable ? 0 : 1);
  }
}