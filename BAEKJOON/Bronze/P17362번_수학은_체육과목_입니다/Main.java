package P17362번_수학은_체육과목_입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()) % 8;
    if (N == 1) {
      System.out.println("1");
    } else if (N == 2 || N == 0) {
      System.out.println("2");
    } else if (N == 3 || N == 7) {
      System.out.println("3");
    } else if (N == 4 || N == 6) {
      System.out.println("4");
    } else {
      System.out.println("5");
    }
  }
}