package P_A번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int T = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    int Time = 0;
    boolean al = true;
    if (T <= 11)
      Time = 0;
    else if (12 <= T && T <= 16)
      Time = 1;
    else
      Time = 2;
    if (S == 0)
      al = false;
    if (al || Time != 1) {
      System.out.println("280");
    } else if (Time == 1 && !al) {
      System.out.println("320");
    }
  }
}