package P1100번_하얀_칸;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = 0;
    for (int i = 0; i < 8; i++) {
      String line = br.readLine();
      int j = 0;
      if (i % 2 == 1)
        j = 1;
      for (; j < 8; j += 2)
        if (line.charAt(j) == 'F')
          count++;
    }
    System.out.println(count);
  }
}