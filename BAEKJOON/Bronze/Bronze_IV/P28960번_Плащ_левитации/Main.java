package BAEKJOON.Bronze.Bronze_IV.P28960번_Плащ_левитации;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    int h = readInt();
    int l = readInt();
    int a = readInt();
    int b = readInt();
    System.out.println((((a <= l) && (b <= 2 * h)) || ((b <= l) && (a <= 2 * h))) ? "YES" : "NO");
  }

  private static int readInt() throws IOException {
    int c = System.in.read(), n = 0;
    while (c <= ' ')
      c = System.in.read();
    while ('0' <= c && c <= '9') {
      n = (n * 10) + (c & 15);
      c = System.in.read();
    }
    return n;
  }
}
