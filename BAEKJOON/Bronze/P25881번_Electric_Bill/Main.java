package P25881번_Electric_Bill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int first = Integer.parseInt(st.nextToken());
    int additional = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      int energyConsumption = Integer.parseInt(br.readLine());
      int charge = (energyConsumption > 1000 ? 1000 * first : energyConsumption * first)
          + (energyConsumption > 1000 ? ((energyConsumption - 1000) * additional) : 0);
      sb.append(energyConsumption).append(' ').append(charge).append('\n');
    }
    System.out.print(sb.toString());
  }
}