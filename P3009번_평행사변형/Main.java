package P3009번_평행사변형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x[][] = new int[2][2];
    int y[][] = new int[2][2];
    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int xin = Integer.parseInt(st.nextToken());
      int yin = Integer.parseInt(st.nextToken());
      if (x[0][0] == 0) {
        x[0][0] = xin;
        x[0][1]++;
      } else if (x[0][0] == xin) {
        x[0][1]++;
      } else if (x[1][0] == 0) {
        x[1][0] = xin;
        x[1][1]++;
      } else if (x[1][0] == xin) {
        x[1][1]++;
      }
      if (y[0][0] == 0) {
        y[0][0] = yin;
        y[0][1]++;
      } else if (y[0][0] == yin) {
        y[0][1]++;
      } else if (y[1][0] == 0) {
        y[1][0] = yin;
        y[1][1]++;
      } else if (y[1][0] == yin) {
        y[1][1]++;
      }
    }
    if (x[0][1] == 1) {
      System.out.print(x[0][0] + " ");
    } else {
      System.out.print(x[1][0] + " ");
    }
    if (y[0][1] == 1) {
      System.out.print(y[0][0]);
    } else {
      System.out.print(y[1][0]);
    }
  }
}