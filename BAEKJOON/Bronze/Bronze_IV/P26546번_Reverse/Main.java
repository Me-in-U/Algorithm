package P26546번_Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int o = 0; o < n; o++) {
      String[] input = br.readLine().split(" ");
      String word = input[0];
      int i = Integer.parseInt(input[1]);
      int j = Integer.parseInt(input[2]);
      sb.append(word.substring(0, i)).append(word.substring(j, word.length())).append('\n');
    }
    System.out.print(sb.toString());
  }
}