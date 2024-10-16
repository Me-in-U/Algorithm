package P27918번_탁구_경기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int D = 0;
    int P = 0;
    boolean end = false;
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String str = br.readLine();
      if (!end) {
        if (str.equals("D")) {
          D++;
        } else {
          P++;
        }
        if (Math.abs(D - P) == 2) {
          end = true;
        }
      }
    }
    System.out.println(D + ":" + P);
  }
}