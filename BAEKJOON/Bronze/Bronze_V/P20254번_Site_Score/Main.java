package P20254번_Site_Score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    System.out.println((56 * Integer.parseInt(input[0]) + (24 * Integer.parseInt(input[1]))
        + (14 * Integer.parseInt(input[2])) + (6 * Integer.parseInt(input[3]))));
  }
}