package P2460번_지능형_기차_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max = 0;
    int now = 0;
    for (int i = 0; i < 10; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int getOff = Integer.parseInt(st.nextToken());
      int boarding = Integer.parseInt(st.nextToken());
      now = now - getOff + boarding;
      max = Math.max(max, now);
    }
    System.out.println(max);
  }
}