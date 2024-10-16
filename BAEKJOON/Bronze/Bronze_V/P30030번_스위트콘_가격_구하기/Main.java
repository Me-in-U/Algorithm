package P30030번_스위트콘_가격_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println((Integer.parseInt(br.readLine()) * 10) / 11);
  }
}