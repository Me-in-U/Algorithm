package 선린.B;

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
    int K = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < K; i++) {
      int G = Integer.parseInt(st.nextToken());
      int P = G * 100 / N;
      int D = 0;
      if (0 <= P && P <= 4) {
        D = 1;
      } else if (4 < P && P <= 11) {
        D = 2;
      } else if (11 < P && P <= 23) {
        D = 3;
      } else if (23 < P && P <= 40) {
        D = 4;
      } else if (40 < P && P <= 60) {
        D = 5;
      } else if (60 < P && P <= 77) {
        D = 6;
      } else if (77 < P && P <= 89) {
        D = 7;
      } else if (89 < P && P <= 96) {
        D = 8;
      } else if (96 < P && P <= 100) {
        D = 9;
      }
      sb.append(D).append(' ');
    }
    System.out.print(sb.toString());
  }
}
