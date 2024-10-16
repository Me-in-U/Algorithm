package P21638번_SMS_from_MCHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int t1 = Integer.parseInt(input[0]);
    int v1 = Integer.parseInt(input[1]);
    input = br.readLine().split(" ");
    int t2 = Integer.parseInt(input[0]);
    int v2 = Integer.parseInt(input[1]);
    if (t2 < 0 && 10 <= v2) {
      System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
    } else if (t1 > t2) {
      System.out.println("MCHS warns! Low temperature is expected tomorrow.");
    } else if (v1 < v2) {
      System.out.println("MCHS warns! Strong wind is expected tomorrow.");
    } else {
      System.out.println("No message");
    }
  }
}
