package P11729번_하노이_탑;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static StringBuilder sb = new StringBuilder();
  public static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    hanoi(N, 1, 3);

    bw.write(Integer.toString(count));
    bw.newLine();
    bw.write(sb.toString());
    bw.flush();

    br.close();
    bw.close();
  }

  public static void hanoi(int n, int a, int b) {
    count++;
    if (n == 1) {
      sb.append(a + " " + b).append('\n');
      return;
    }
    hanoi(n - 1, a, 6 - a - b);
    sb.append(a + " " + b).append('\n');
    hanoi(n - 1, 6 - a - b, b);
  }
}