package P21300번_Bottle_Return;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int sum = 0;
    for (int i = 0; i < input.length; i++) {
      sum += Integer.parseInt(input[i]);
    }
    sum *= 5;
    System.out.println(sum);
  }
}
