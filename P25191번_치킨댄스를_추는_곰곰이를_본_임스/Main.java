package P25191번_치킨댄스를_추는_곰곰이를_본_임스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int coke = Integer.parseInt(st.nextToken());
    int beer = Integer.parseInt(st.nextToken());
    int eat = (coke / 2) + beer;
    if (N >= eat) {
      System.out.println(eat);
    } else {
      System.out.println(N);
    }
  }
}
