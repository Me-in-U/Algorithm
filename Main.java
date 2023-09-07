import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] h1 = new int[2][3];
    int[][] data = new int[2][3];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        data[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    h1[0] = data[0];
    h1[1] = Arrays.copyOf(data[1], data[1].length);
    data[0][0] = 0;
    data[1][0] = 0;
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(h1[i][j] + " ");
      }
      System.out.println();
    }
    StringBuilder sb = new StringBuilder();
  }
}