package P3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static long A, B, C, X, Y, Z;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    A = Integer.parseInt(st.nextToken());
    B = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    X = Integer.parseInt(st.nextToken());
    Y = Integer.parseInt(st.nextToken());
    Z = Integer.parseInt(st.nextToken());

    long sum = A + B + C;
    // System.out.println("===============");
    A_eat();
    B_eat();
    C_eat();
    // System.out.println(A + " " + B + " " + C);
    // System.out.println(X + " " + Y + " " + Z);
    // System.out.println("--------");
    while (true) {
      if (A == 0) {
        Y += X / 3;
        X %= 3;
        B_eat();
      }
      if (B == 0) {
        Z += Y / 3;
        Y %= 3;
        C_eat();
      }
      if (C == 0) {
        X += Z / 3;
        Z %= 3;
        A_eat();
      }
      if ((A == 0 && B == 0 && C == 0)
          || (X == 0 && Y == 0 && Z == 0)) {
        break;
      }
      // System.out.println(A + " " + B + " " + C);
      // System.out.println(X + " " + Y + " " + Z);
      // System.out.println("--------------");
      if (X < 3 && Y < 3 && Z < 3) {
        if (A == 0 || X == 0) {
          if (B == 0 || Y == 0) {
            if (C == 0 || Z == 0) {
              break;
            }
          }
        }
      }
    }
    System.out.println(sum - (A + B + C));
  }

  public static void A_eat() {
    if (A != 0) {
      if (A >= X) {
        A -= X;
        X = 0;
      } else {
        X -= A;
        A = 0;
      }
    }
  }

  public static void B_eat() {
    if (B != 0) {
      if (B >= Y) {
        B -= Y;
        Y = 0;
      } else {
        Y -= B;
        B = 0;
      }
    }
  }

  public static void C_eat() {
    if (C != 0) {
      if (C >= Z) {
        C -= Z;
        Z = 0;
      } else {
        Z -= C;
        C = 0;
      }
    }
  }
}