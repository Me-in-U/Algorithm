package BAEKJOON.Silver.Silver_V.P1543번_문서_검색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String find = br.readLine();
    int count = 0;
    // System.out.println("");
    for (int i = 0; i < find.length(); i++) {
      // System.out.println(i + ": " + "find");
      int temp_count = 0;
      for (int j = i; j < line.length() - find.length() + 1;) {
        // System.out.println(line.substring(j, j + find.length()));
        if (line.substring(j, j + find.length()).equals(find)) {
          temp_count++;
          j += find.length();
        } else {
          j++;
        }
      }
      count = Math.max(count, temp_count);
    }
    System.out.println(count);
  }
}