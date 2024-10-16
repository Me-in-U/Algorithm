package P28113번_정보섬의_대중교통;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int A = Integer.parseInt(input[1]);
    int B = Integer.parseInt(input[2]);
    int time = A - B;
    if (time == 0) {
      System.out.println("Anything");
    } else if (time > 0) {
      System.out.println("Subway");
    } else {
      System.out.println("Bus");
    }
  }
}