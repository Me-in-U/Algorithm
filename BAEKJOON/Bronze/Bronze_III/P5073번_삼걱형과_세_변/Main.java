package P5073번_삼걱형과_세_변;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] inp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
    while (!(inp[0] == 0 && inp[1] == 0 && inp[2] == 0)) {
      Arrays.sort(inp);
      if ((inp[1] + inp[0]) <= inp[2]) {
        sb.append("Invalid").append('\n');
      } else if ((inp[0] == inp[1]) && (inp[1] == inp[2])) {
        sb.append("Equilateral").append('\n');
      } else if ((inp[0] == inp[1]) || (inp[1] == inp[2])) {
        sb.append("Isosceles").append('\n');
      } else {
        sb.append("Scalene").append('\n');
      }
      inp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    System.out.print(sb.toString());
  }
}