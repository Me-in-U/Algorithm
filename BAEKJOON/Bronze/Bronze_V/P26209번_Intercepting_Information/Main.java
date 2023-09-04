package P26209번_Intercepting_Information;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    String result = "S";
    for (int i = 0; i < 8; i++) {
      if (input[i].equals("9")) {
        result = "F";
      }
    }
    System.out.println(result);
  }
}
