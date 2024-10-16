package P30204번_병영외_급식;

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
    int X = Integer.parseInt(st.nextToken());
    int total = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      total += Integer.parseInt(st.nextToken());
    }
    System.out.println(total % X == 0 ? 1 : 0);
  }
}