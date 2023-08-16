package P29163번_Счастье_Мистера_Бина;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int even = (int) Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .filter(num -> num % 2 == 0)
        .count();
    System.out.println(even > n - even ? "Happy" : "Sad");
  }
}