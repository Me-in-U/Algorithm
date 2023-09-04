package Bronze_I.P13458번_시험_감독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    long count = 0;
    int[] rooms = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    String[] input = br.readLine().split(" ");
    int B = Integer.parseInt(input[0]);
    int C = Integer.parseInt(input[1]);
    for (int i = 0; i < N; i++) {
      rooms[i] -= B;
      count++;
      if (rooms[i] > 0) {
        if (rooms[i] % C != 0) {
          count++;
        }
        count += rooms[i] / C;
      }
    }
    System.out.println(count);
  }
}