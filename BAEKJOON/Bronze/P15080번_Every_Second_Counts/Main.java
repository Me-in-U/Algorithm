package P15080번_Every_Second_Counts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] t1 = br.readLine().split(" : ");
    String[] t2 = br.readLine().split(" : ");
    int tt1 = Integer.parseInt(t1[0]) * 3600 + Integer.parseInt(t1[1]) * 60 + Integer.parseInt(t1[2]);
    int tt2 = Integer.parseInt(t2[0]) * 3600 + Integer.parseInt(t2[1]) * 60 + Integer.parseInt(t2[2]);
    if (tt1 > tt2) {
      System.out.println(tt2 + (24 * 60 * 60) - tt1);
    } else {
      System.out.println(tt2 - tt1);
    }
  }
}