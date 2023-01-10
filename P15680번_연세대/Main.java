package P15680번_연세대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int N = Integer.parseInt(br.readLine());
    if (N == 0) {
      System.out.println("YONSEI");
    } else if (N == 1) {
      System.out.println("Leading the Way to the Future");
    }
  }
}