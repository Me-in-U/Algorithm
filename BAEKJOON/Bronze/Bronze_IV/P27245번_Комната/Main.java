package P27245번_Комната;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int w = Integer.parseInt(br.readLine());
    int l = Integer.parseInt(br.readLine());
    int h = Integer.parseInt(br.readLine());
    boolean good = true;
    if (Math.min(w, l) < 2 * h || Math.min(w, l) * 2 < Math.max(w, l)) {
      good = false;
    }
    System.out.println(good ? "good" : "bad");
  }
}