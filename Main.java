import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = (int) Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).filter(a -> a >= 10).count();
    int[] sorted = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).filter(a -> a >= 10).sorted()
        .toArray();
  }
}