package PD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    boolean found = false;
    char front = str.charAt(0);
    char back = str.charAt(N - 1);
    for (int length = 3; length < N; length++) {
      for (int first = 0; N - first > 0; first++) {
        if (str.charAt(first) == front && str.charAt(first + length) == back) {
          String comp1 = str.substring(first, first + length + 1);
          System.out.println(comp1);
          for (int second = first + 1; N - second > 0; second++) {
            if (str.charAt(second) == front && str.charAt(second + length) == back) {
              String comp2 = str.substring(second, second + length + 1);
              System.out.println(comp2);
              int count = 0;
              for (int i = 0; i < length; i++) {
                if (comp1.charAt(i) != comp2.charAt(i)) {
                  count++;
                }
                if (count == 1) {
                  found = true;
                  break;
                }
              }
            }
            if (found) {
              break;
            }
          }
        }
        if (found) {
          break;
        }
      }
      if (found) {
        break;
      }
    }
    if (found) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}