package P1213번_팰린드롬_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력
    String line = br.readLine();
    int[] arr = new int[26];
    for (int i = 0; i < line.length(); i++) {
      arr[line.charAt(i) - 'A']++;
    }

    // 홀수개 찾기
    int evenCount = 0;
    int even = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 1) {
        evenCount++;
        even = i;
      }
    }

    // 출력
    if (evenCount > 1) {
      System.out.println("I'm Sorry Hansoo");
    } else {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i] / 2; j++) {
          sb.append((char) (i + 'A'));
        }
      }
      if (evenCount != 0) {
        sb.append((char) (even + 'A'));
      }
      for (int i = arr.length - 1; i >= 0; i--) {
        for (int j = 0; j < arr[i] / 2; j++) {
          sb.append((char) (i + 'A'));
        }
      }
      System.out.println(sb.toString());
    }
  }
}