package P5525번_IOIOI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = 0;
    int IOI = 0;
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    char[] S = br.readLine().toCharArray();
    StringBuilder sb = new StringBuilder();
    sb.append("I");
    for (int i = 0; i < N; i++) {
      sb.append("OI");
    }
    String P = sb.toString();

    for (int i = 0; i < M - (2 * N + 1); i++) {
      if (S[i] == 'I') {

      }
    }

    System.out.println(count);
  }
}