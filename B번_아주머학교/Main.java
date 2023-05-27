package B번_아주머학교;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      int count = 0;
      int countSlash = 0;
      for (int j = 0; j < line.length(); j++) {
        char c = line.charAt(j);
        if (c == '\\') {
          if (j < line.length() - 1) {
            char c2 = line.charAt(j + 1);
            if (c2 == '\'') {
              count++;
              countSlash++;
              j++;
            } else if (c2 == '\\') {
              if (j < line.length() - 2) {
                char c3 = line.charAt(j + 2);
                if (c3 == '\'') {
                  count++;
                  countSlash += 2;
                  j += 2;
                }
              }
            }
          }
        } else if (c == '@' || c == '[' || c == '!' || c == ';' || c == '^' || c == '0' || c == '7') {
          count++;
        }
      }
      if (count >= (line.length() - countSlash) / 2.0) {
        sb.append("I don't understand").append('\n');
      } else {
        line = line.replace("@", "a");
        line = line.replace("[", "c");
        line = line.replace("!", "i");
        line = line.replace(";", "j");
        line = line.replace("^", "n");
        line = line.replace("0", "o");
        line = line.replace("7", "t");
        line = line.replace("\\\\\'", "w");
        line = line.replace("\\\'", "v");
        sb.append(line).append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}
