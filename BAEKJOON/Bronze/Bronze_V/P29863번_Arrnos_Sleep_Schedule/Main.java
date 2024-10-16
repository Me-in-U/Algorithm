package P29863번_Arrnos_Sleep_Schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int result = 0;
    int T = Integer.parseInt(br.readLine());
    if (20 <= T && T <= 23) {
      result = 24 - T;
      result += Integer.parseInt(br.readLine());
    } else {
      result = Integer.parseInt(br.readLine()) - T;
    }
    System.out.println(result);
  }
}