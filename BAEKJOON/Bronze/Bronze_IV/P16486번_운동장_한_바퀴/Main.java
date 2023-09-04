package P16486번_운동장_한_바퀴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double d1 = Integer.parseInt(br.readLine());
    double d2 = Integer.parseInt(br.readLine());
    double PI = 3.141592;
    System.out.print((2 * d1) + (2 * PI * d2));
  }
}