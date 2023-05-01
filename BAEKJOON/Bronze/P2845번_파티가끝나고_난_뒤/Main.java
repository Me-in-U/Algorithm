package P2845번_파티가끝나고_난_뒤;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int total = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 5; i++)
      sb.append((Integer.parseInt(st.nextToken()) - total) + " ");
    System.out.print(sb.toString());
  }
}