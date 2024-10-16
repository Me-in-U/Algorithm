package P26742번_Skarpetki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String socks = br.readLine();
    int C = 0;
    for (int i = 0; i < socks.length(); i++)
      if (socks.charAt(i) == 'C')
        C++;
    System.out.println((C / 2) + ((socks.length() - C) / 2));
  }
}