package P24079번_Moving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine());
    int Y = Integer.parseInt(br.readLine());
    int Z = Integer.parseInt(br.readLine());
    System.out.println(X + Y > Z ? 0 : 1);
  }
}