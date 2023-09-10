package 브실컵.W;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int J = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    int count = 0;
    for (int i = 0; i < N; i++) {
      int size = 0;
      char[] chars = br.readLine().toCharArray();
      for (int k = 0; k < chars.length; k++) {
        char c = chars[k];
        if ('A' <= c && c <= 'Z') {
          size += 4;
        } else if (('a' <= c && c <= 'z') || ('0' <= c && c <= '9')) {
          size += 2;
        } else {
          size += 1;
        }
      }
      if (size <= J) {
        count++;
      }
    }
    System.out.println(count);
  }
}