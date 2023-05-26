package P20353번_Atrium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(Math.pow(Long.parseLong(br.readLine()), 0.5) * 4);
  }
}