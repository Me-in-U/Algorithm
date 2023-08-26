package P27880번_Gahui_and_Soongsil_University_station;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int result = 0;
    for (int i = 0; i < 4; i++) {
      String[] input = br.readLine().split(" ");
      result += input[0].equals("Es") ? Integer.parseInt(input[1]) * 21 : Integer.parseInt(input[1]) * 17;
    }
    System.out.println(result);
  }
}