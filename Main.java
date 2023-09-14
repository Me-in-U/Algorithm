import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    StringTokenizer st1 = new StringTokenizer(br.readLine());
    int K = Integer.parseInt(st1.nextToken());
    int X = Integer.parseInt(st1.nextToken());

    int min = 0;
    int max = 0;

    if (K - X < 0) {
      min = 0;
    } else {
      min = K - X;
    }

    if (K + X >= 10000) {
      max = 10000;
    } else {
      max = K + X;
    }

    if (max < A || B < min) {
      System.out.println("IMPOSSIBLE");
    } else if (min <= A && max <= B) {
      System.out.println(max - A + 1);
    } else if (min <= A && B <= max) {
      System.out.println(B - A + 1);
    } else if (A <= min && B <= max) {
      System.out.println(B - min + 1);
    } else if (A <= min && max <= B) {
      System.out.println(max - min + 1);
    }
  }
}