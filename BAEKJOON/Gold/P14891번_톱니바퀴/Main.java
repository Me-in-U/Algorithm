package P14891번_톱니바퀴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    wheel w1 = new wheel(br.readLine());
    wheel w2 = new wheel(br.readLine());
    wheel w3 = new wheel(br.readLine());
    wheel w4 = new wheel(br.readLine());

    int K = Integer.parseInt(br.readLine());
    for (int i = 0; i < K; i++) {
      st = new StringTokenizer(br.readLine());
      int num = Integer.parseInt(st.nextToken());
      int direction = Integer.parseInt(st.nextToken());
      if (direction == 1) {
        if (num == 1) {
          if (w1.right_index != w2.left_index) {

          }
          w1.spin_cw();
          w2.spin_ccw();
          w3.spin_cw();
          w4.spin_ccw();
        } else if (num == 2) {

        } else if (num == 3) {

        } else {

        }

      } else {
        if (num == 1) {

        } else if (num == 2) {

        } else if (num == 3) {

        } else {

        }
      }
    }
  }

}

class wheel {
  int[] SN = new int[8];
  int left_index = 6;
  int right_index = 2;

  wheel(String input) {
    for (int i = 0; i < 8; i++) {
      this.SN[i] = input.charAt(i) - '0';
    }
  }

}