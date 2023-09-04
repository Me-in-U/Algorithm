package P1735번_분수합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    int a_numerator = Integer.parseInt(st.nextToken());
    int a_denominator = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int b_numerator = Integer.parseInt(st.nextToken());
    int b_denominator = Integer.parseInt(st.nextToken());

    int numerator = (a_numerator * b_denominator) + (a_denominator * b_numerator);
    int denominator = a_denominator * b_denominator;

    int mod = gcd(numerator, denominator);

    System.out.println(numerator / mod + " " + denominator / mod);
  }

  public static int gcd(int a, int b) {
    if (a <= b) {
      int temp = a;
      a = b;
      b = temp;
    }

    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
