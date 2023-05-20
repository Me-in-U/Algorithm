package E번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  public static HashSet<String> set;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    set = new HashSet<>();
    int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    find(str);
    System.out.println(set.size() + 1);
  }

  public static void find(String str) {
    for (int i = 0; i <= str.length() - 8; i++) {
      if (str.substring(i, i + 8).equals("longlong")) {
        String newStr = str.substring(0, i) + "int" + str.substring(i + 8, str.length());
        if (!set.contains(newStr)) {
          find(newStr);
          set.add(newStr);
        }
      }
    }
  }
}