package Bronze_I.P29196번_소수가_아닌_수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double input = Double.parseDouble(br.readLine());
    int a = 99999999;
    int b = 100000000;
    double result = 0.99999999;
    boolean unable = false;
    while (result != input) {
      a--;
      if (a == 0) {
        a = 1;
        b--;
      }
      if (a == 1 && b == 1) {
        unable = true;
        break;
      }
      result = a / (b * 1.0);
    }
    if (unable) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
      System.out.println(a + " " + b);
    }
  }
}