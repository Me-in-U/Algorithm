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

    for (int i = 0; i < M - 2; i++) {
      if (S[i] == 'I') {
        if (S[i + 1] == 'O' && S[i + 2] == 'I') {
          IOI++;
          i++;
          if (IOI == N) {
            IOI--;
            count++;
          }
        } else {
          IOI = 0;
        }
      }
    }

    System.out.println(count);
  }
}