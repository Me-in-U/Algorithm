package P29751번_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int W = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());
    System.out.println(String.format("%.1f", W * H * 0.5));
  }
}