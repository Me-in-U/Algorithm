package A번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int prev = 0;
    int count = 0;
    for (int i = 0; i < N; i++) {
      int next = Integer.parseInt(st.nextToken());
      if (prev <= next) {
        count++;
      }
      prev = next;
    }
    System.out.println(count);
  }
}
