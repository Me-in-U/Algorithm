package BAEKJOON.Silver.Silver_V.P1769번_3의_배수;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int count = 0;
    while (str.length() > 1) {
        count++;
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
            sum += str.charAt(i) - 48;
        str = String.valueOf(sum);
    }
    System.out.println(count);
    System.out.println(Integer.parseInt(str) % 3 == 0 ? "YES" : "NO");
  }
}