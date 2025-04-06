package BAEKJOON.Platinum.Platinum_V.P11585번_속타는_저녁_메뉴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    char[] rouletteOriginal = new char[N * 2];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      char c = st.nextToken().charAt(0);
      rouletteOriginal[i] = c;
      rouletteOriginal[i + N] = c;
    }
    st = new StringTokenizer(br.readLine());
    char[] roulettePresent = new char[N];
    for (int i = 0; i < N; i++) {
      roulettePresent[i] = st.nextToken().charAt(0);
    }
    int count = kmpSearch(rouletteOriginal, roulettePresent);
    int gcd = gcd(count, N);
    System.out.println((count / gcd) + "/" + (N / gcd));
  }

  public static int kmpSearch(char[] text, char[] pattern) {
    int pLen = pattern.length;
    int[] table = buildPMT(pattern);
    int index = 0;
    int count = 0;
    for (int i = 0; i < text.length - 1; i++) {
      while (index > 0 && text[i] != pattern[index]) {
        index = table[index - 1];
      }
      if (text[i] == pattern[index]) {
        if (index == pLen - 1) {
          count++;
          index = table[index];
        } else {
          index++;
        }
      }
    }
    return count;
  }

  public static int[] buildPMT(char[] pattern) {
    int[] pmt = new int[pattern.length];
    int length = 0;
    for (int i = 1; i < pattern.length; i++) {
      while (length != 0 && pattern[i] != pattern[length]) {
        length = pmt[length - 1];
      }
      if (pattern[i] == pattern[length]) {
        pmt[i] = ++length;
      }
    }
    return pmt;
  }

  public static int gcd(int a, int b) {
    if (a % b == 0) {
      return b;
    }
    return gcd(b, a % b);
  }
}