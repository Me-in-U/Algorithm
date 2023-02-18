package P20205번_교수님_그림이_깨지는데여;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    for (int i = 0; i < N; i++) {
      String[] data = br.readLine().split(" ");
      for (int h = 0; h < K; h++) {
        for (int j = 0; j < N; j++) {
          for (int k = 0; k < K; k++) {
            sb.append(data[j] + " ");
          }
        }
        sb.append('\n');
      }
    }
    System.out.println(sb.toString());
  }
}