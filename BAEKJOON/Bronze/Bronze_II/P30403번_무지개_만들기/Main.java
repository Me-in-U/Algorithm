package P30403번_무지개_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] UpperRainbow = new int[7];
    int[] LowerRainbow = new int[7];
    int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    for (int i = 0; i < N; i++) {
      char c = str.charAt(i);
      if (c == 'R') {
        UpperRainbow[0]++;
      } else if (c == 'r') {
        LowerRainbow[0]++;
      } else if (c == 'O') {
        UpperRainbow[1]++;
      } else if (c == 'o') {
        LowerRainbow[1]++;
      } else if (c == 'Y') {
        UpperRainbow[2]++;
      } else if (c == 'y') {
        LowerRainbow[2]++;
      } else if (c == 'G') {
        UpperRainbow[3]++;
      } else if (c == 'g') {
        LowerRainbow[3]++;
      } else if (c == 'B') {
        UpperRainbow[4]++;
      } else if (c == 'b') {
        LowerRainbow[4]++;
      } else if (c == 'I') {
        UpperRainbow[5]++;
      } else if (c == 'i') {
        LowerRainbow[5]++;
      } else if (c == 'V') {
        UpperRainbow[6]++;
      } else if (c == 'v') {
        LowerRainbow[6]++;
      }
    }
    int UCaseCount = 100;
    for (int i = 0; i < UpperRainbow.length; i++) {
      UCaseCount = Math.min(UCaseCount, UpperRainbow[i]);
    }
    int LCaseCount = 100;
    for (int i = 0; i < LowerRainbow.length; i++) {
      LCaseCount = Math.min(LCaseCount, LowerRainbow[i]);
    }
    if (UCaseCount == 0 && LCaseCount == 0) {
      System.out.println("NO!");
    } else if (UCaseCount == 0 && LCaseCount != 0) {
      System.out.println("yes");
    } else if (UCaseCount != 0 && LCaseCount == 0) {
      System.out.println("YES");
    } else {
      System.out.println("YeS");
    }
  }
}