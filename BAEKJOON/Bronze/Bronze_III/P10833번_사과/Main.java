package P10833번_사과;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String[] line = br.readLine().split(" ");
      sum += Integer.parseInt(line[1]) % Integer.parseInt(line[0]);
    }
    System.out.println(sum);
  }
}