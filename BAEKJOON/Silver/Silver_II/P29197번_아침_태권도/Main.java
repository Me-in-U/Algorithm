package Silver_II.P29197번_아침_태권도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<Double> set1 = new HashSet<>();
    Set<Double> set2 = new HashSet<>();
    Set<Double> set3 = new HashSet<>();
    Set<Double> set4 = new HashSet<>();
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    boolean xp = false;
    boolean xm = false;
    boolean yp = false;
    boolean ym = false;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      if (x == 0 || y == 0) {
        if (x == 0) {
          if (y > 0)
            yp = true;
          else
            ym = true;
        } else {
          if (x > 0)
            xp = true;
          else
            xm = true;
        }
      } else {
        if (x > 0 && y > 0)
          set1.add(x / (y * 1.0));
        else if (x < 0 && y > 0)
          set2.add(x / (y * 1.0));
        else if (x < 0 && y < 0)
          set3.add(x / (y * 1.0));
        else
          set4.add(x / (y * 1.0));
      }
    }
    int count = set1.size() + set2.size() + set3.size() + set4.size();
    if (xp)
      count++;
    if (xm)
      count++;
    if (yp)
      count++;
    if (ym)
      count++;
    System.out.println(count);
  }
}