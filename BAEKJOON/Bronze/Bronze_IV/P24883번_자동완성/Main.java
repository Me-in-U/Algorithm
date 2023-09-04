package P24883번_자동완성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();
    if (input[0] == 'N' || input[0] == 'n') {
      System.out.println("Naver D2");
    } else {
      System.out.println("Naver Whale");
    }
  }
}