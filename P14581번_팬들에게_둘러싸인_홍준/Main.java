package P14581번_팬들에게_둘러싸인_홍준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String id = ":" + br.readLine() + ":";
    String fan = ":fan:";
    StringBuilder sb = new StringBuilder();
    sb.append(fan + fan + fan).append('\n');
    sb.append(fan + id + fan).append('\n');
    sb.append(fan + fan + fan).append('\n');
    System.out.print(sb.toString());
  }
}