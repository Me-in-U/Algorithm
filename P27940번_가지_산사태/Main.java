package P27940번_가지_산사태;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int N;
  public static int M;
  public static int K;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    boolean collapsed = false;
    for (int i = 1; i <= M; i++) {
      st = new StringTokenizer(br.readLine());
      if (!collapsed) {
        int ti = Integer.parseInt(st.nextToken());
        int ri = Integer.parseInt(st.nextToken());
        K -= ri;
        if (K < 0) {
          System.out.println(i + " 1");
          collapsed = true;
        }
      }
    }
    if (!collapsed) {
      System.out.println("-1");
    }
  }
}
