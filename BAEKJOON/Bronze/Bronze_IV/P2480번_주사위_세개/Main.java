package P2480번_주사위_세개;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] dices = new int[6];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 3; i++) {
      dices[Integer.parseInt(st.nextToken()) - 1]++;
    }
    int price = 0;
    for (int i = 0; i < 6; i++) {
      if (dices[i] == 1) {
        price = (i + 1) * 100;
      } else if (dices[i] == 2) {
        price = 1000 + ((i + 1) * 100);
        break;
      } else if (dices[i] == 3) {
        price = 10000 + ((i + 1) * 1000);
        break;
      }
    }
    System.out.println(price);
  }
}