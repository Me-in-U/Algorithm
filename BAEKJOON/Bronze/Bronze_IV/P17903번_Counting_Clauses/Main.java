package P17903번_Counting_Clauses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int m = Integer.parseInt(input[0]);
    for (int i = 0; i < m; i++) {
      br.readLine();
    }
    if (8 <= m) {
      System.out.println("satisfactory");
    } else {
      System.out.println("unsatisfactory");
    }
  }
}