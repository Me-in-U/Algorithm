package P26489번_Gum_Gum_for_Jay_Jay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = 0;
    String a;
    while ((a = br.readLine()) != null) {
      count++;
    }
    System.out.println(count);
  }
}