package P1343번_폴리오미노;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    boolean able = true;
    String line = br.readLine();
    line += '#';
    char prev = line.charAt(0);
    int count = 1;

    for (int i = 1; i < line.length(); i++) {
      char temp = line.charAt(i);
      if (prev == temp)
        count++;
      else {
        if (prev == 'X') {
          if (count % 4 == 2 || count % 2 == 0) {
            for (int k = 0; k < count / 4; k++)
              sb.append("AAAA");
            for (int k = 0; k < ((count % 4) / 2); k++)
              sb.append("BB");
          } else {
            able = false;
            break;
          }
        } else {
          for (int k = 0; k < count; k++) {
            sb.append(".");
          }
        }
        prev = temp;
        count = 1;
      }
    }
    // 출력
    if (able)
      System.out.println(sb);
    else
      System.out.println("-1");
  }
}
