package BAEKJOON.Bronze.Bronze_IV.P30402번_감마선을_맞은_컴퓨터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[][] Picture = new char[15][15];
    boolean isChunbae = false;
    boolean isNabi = false;
    StringTokenizer st = null;
    for (int i = 0; i < Picture.length; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < Picture.length; j++) {
        char c = st.nextToken().charAt(0);
        if (c == 'w') {
          isChunbae = true;
        } else if (c == 'b') {
          isNabi = true;
        }
      }
    }
    if (isChunbae) {
      System.out.println("chunbae");
    } else if (isNabi) {
      System.out.println("nabi");
    } else {
      System.out.println("yeongcheol");
    }
  }
}