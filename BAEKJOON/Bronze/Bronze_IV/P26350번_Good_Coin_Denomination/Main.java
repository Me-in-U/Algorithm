package P26350번_Good_Coin_Denomination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      String line = br.readLine();
      int[] coins = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
      boolean good = true;
      for (int j = 1; j < coins[0]; j++) {
        if (coins[j] * 2 > coins[j + 1]) {
          good = false;
          break;
        }
      }
      sb.append("Denominations: ");
      for (int j = 1; j <= coins[0]; j++) {
        sb.append(coins[j]).append(' ');
      }
      sb.append(good ? "\nGood coin denominations!" : "\nBad coin denominations!").append("\n\n");
    }
    System.out.print(sb.toString());
  }
}
