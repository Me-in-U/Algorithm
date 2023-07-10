package P5358번_Football_Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = "";
    StringBuilder sb = new StringBuilder();
    while ((name = br.readLine()) != null) {
      for (int i = 0; i < name.length(); i++) {
        char c = name.charAt(i);
        if (c == 'i') {
          sb.append('e');
        } else if (c == 'e') {
          sb.append('i');
        } else if (c == 'I') {
          sb.append('E');
        } else if (c == 'E') {
          sb.append('I');
        } else {
          sb.append(c);
        }
      }
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}