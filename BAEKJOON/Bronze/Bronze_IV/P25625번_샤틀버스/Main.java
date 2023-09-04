package P25625번_샤틀버스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] inputInt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    System.out.println(inputInt[0] <= inputInt[1] ? inputInt[1] % inputInt[0] : inputInt[0] + inputInt[1]);
  }
}