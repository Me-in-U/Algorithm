package P9536번_여우는_어떻게_울지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    HashSet<String> set = new HashSet<>();

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      String recorded_sound = br.readLine();
      while (true) {
        String input = br.readLine();
        if (input.equals("what does the fox say?")) {
          st = new StringTokenizer(recorded_sound);
          while (st.hasMoreTokens()) {
            String sound = st.nextToken();
            if (!set.contains(sound)) {
              sb.append(sound + " ");
            }
          }
          sb.append('\n');
          break;
        } else {
          String[] animal_sound = input.split(" ");
          set.add(animal_sound[2]);
        }
      }
    }
    System.out.print(sb.toString());
  }
}