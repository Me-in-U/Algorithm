package P10707번_수도요금;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X_Per_Liter = Integer.parseInt(br.readLine());
    int Y_Base_Cost = Integer.parseInt(br.readLine());
    int Y_Base_Cost_Limit = Integer.parseInt(br.readLine());
    int Y_Per_Liter = Integer.parseInt(br.readLine());
    int used = Integer.parseInt(br.readLine());

    int X_Cost = X_Per_Liter * used;
    int Y_Cost = Y_Base_Cost;
    if (used > Y_Base_Cost_Limit) {
      Y_Cost += (used - Y_Base_Cost_Limit) * Y_Per_Liter;
    }
    System.out.println(Math.min(X_Cost, Y_Cost));
  }
}