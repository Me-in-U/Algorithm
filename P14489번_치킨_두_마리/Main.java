package P14489번_치킨_두_마리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(br.readLine()) * 2;
    int sum = A + B;
    if (sum >= C) {
      System.out.println(sum - C);
    } else {
      System.out.println(sum);
    }
  }
}