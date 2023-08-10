package P28249번_Chili_Peppers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int totalSHU = 0;
    String pepper = "";
    for (int i = 0; i < N; i++) {
      pepper = br.readLine();
      if (pepper.equals("Poblano")) {
        totalSHU += 1500;
      } else if (pepper.equals("Mirasol")) {
        totalSHU += 6000;
      } else if (pepper.equals("Serrano")) {
        totalSHU += 15500;
      } else if (pepper.equals("Cayenne")) {
        totalSHU += 40000;
      } else if (pepper.equals("Thai")) {
        totalSHU += 75000;
      } else if (pepper.equals("Habanero")) {
        totalSHU += 125000;
      }
    }
    System.out.println(totalSHU);
  }
}