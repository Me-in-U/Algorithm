package P11121번_Communication_Channels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      String[] input = br.readLine().split(" ");
      if (input[0].equals(input[1])) {
        sb.append("OK").append('\n');
      } else {
        sb.append("ERROR").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}