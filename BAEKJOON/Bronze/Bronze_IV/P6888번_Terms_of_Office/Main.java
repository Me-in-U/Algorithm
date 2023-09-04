package P6888번_Terms_of_Office;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int year = x; year <= y; year++) {
      if (((year - x) % 2 == 0) && ((year - x) % 3 == 0) && ((year - x) % 4 == 0) && ((year - x) % 5 == 0))
        sb.append("All positions change in year ").append(year).append('\n');
    }
    System.out.print(sb.toString());
  }
}